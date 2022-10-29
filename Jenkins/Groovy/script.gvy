node {
    
    stage ('Git checkout'){
         
        git 'https://github.com/Krishnamohan-Yerrabilli/jenkins-pipeline.git'
    }
    
    stage ('sending dockerfile to the ansible server over ssh by jenkins'){
        
        sshagent(['ansible']) {
            sh 'ssh -o StrictHostKeyChecking=no ubuntu@43.204.144.251'
            sh 'scp /var/lib/jenkins/workspace/jenkins-pipeline/* ubuntu@43.204.144.251:/home/ubuntu/'
        }
        
    }
   
    
    stage ('Build the Docker Image in the ansible server'){
        
        
        sshagent(['ansible']) {
            sh 'ssh -o StrictHostKeyChecking=no ubuntu@172.31.6.81 cd /home/ubuntu/'
            sh 'ssh -o StrictHostKeyChecking=no ubuntu@172.31.6.81 docker image build -t $JOB_NAME:v1.$BUILD_ID .'
        }
        
    }
    
    
    stage ('Tag the docker image'){
 
        sshagent(['ansible']) {
            sh 'ssh -o StrictHostKeyChecking=no ubuntu@43.204.144.251'      
            sh 'ssh -o StrictHostKeyChecking=no ubuntu@43.204.144.251 docker image tag $JOB_NAME:v1.$BUILD_ID mynameismohan/$JOB_NAME:v1.$BUILD_ID'
            sh 'ssh -o StrictHostKeyChecking=no ubuntu@43.204.144.251 docker image tag $JOB_NAME:v1.$BUILD_ID mynameismohan/$JOB_NAME:latest'
        }
    }
    


    stage ('Push docker image to docker hub'){
        sshagent(['ansible']) {
            withCredentials([string(credentialsId: 'dp', variable: 'dp')]) {
                                sh ('docker login -u mynameismohan -p ${dp}') 
                                sh 'ssh -o StrictHostKeyChecking=no ubuntu@43.204.144.251 docker image push mynameismohan/$JOB_NAME:v1.$BUILD_ID '
                                sh 'ssh -o StrictHostKeyChecking=no ubuntu@43.204.144.251 docker image push mynameismohan/$JOB_NAME:latest '
                }
        }
    }
    
    
    stage ('Copy files from ansible to Webapp-server(kubernetes server)'){
        sshagent(['k8s_servers']) {
            sh 'ssh -o StrictHostKeyChecking=no ubuntu@43.205.210.104 cd /home/ubuntu/'
            sh 'ssh -o StrictHostKeyChecking=no ubuntu@43.205.210.104 rm Deployment.yaml'
            sh 'ssh -o StrictHostKeyChecking=no ubuntu@43.205.210.104 rm Service.yaml'
            sh 'scp /var/lib/jenkins/workspace/jenkins-pipeline/* ubuntu@43.205.210.104:/home/ubuntu'
        }
    }    
    
     stage ('kubernetes Deployment using ansible'){
        sshagent(['ansible']) {
            sh 'ssh -o StrictHostKeyChecking=no ubuntu@43.204.144.251 cd /home/ubuntu/'
            sh 'ssh -o StrictHostKeyChecking=no ubuntu@43.204.144.251 ansible-playbook ansible.yaml'
        }
    }
    

}
