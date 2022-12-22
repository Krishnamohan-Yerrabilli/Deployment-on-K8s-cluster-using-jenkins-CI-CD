<div align="center">

## Deployment on Kubernetes Cluster using Jenkins CI/CD Project

![Kubernetes final image (12)](https://user-images.githubusercontent.com/58173938/197373162-1f510766-4437-41ba-b6f8-deead93c7693.png)

### Whole Project Code Available [Here](https://github.com/Krishnamohan-Yerrabilli/jenkins-pipeline)

### This Repo is to Teach You Each Tool/Technology and How to Implement the Whole Project Step by Step 

</div>

## Prerequisites/tools needed to work on this project. 
 
- [AWS](https://github.com/awsdocs/amazon-ec2-user-guide/blob/master/doc_source/EC2_GetStarted.md)
- [Containers](https://www.redhat.com/en/topics/containers/whats-a-linux-container)
- [Docker](https://docs.docker.com/get-started/overview/)
- [Kubernetes](https://github.com/Krishnamohan-Yerrabilli/Kubernetes-hands-on)
- [Jenkins](https://www.jenkins.io/doc/tutorials/)
- [Ansible](https://docs.ansible.com/ansible/latest/getting_started/index.html)

We will have a deployment over a `Kubernetes cluster` using `Jenkins CI/CD pipeline`,  <br>
in this project, we are taking the help of various DevOps tools like GitHub, Jenkins, <br>
Ansible and a `Kubernetes cluster(2 nodes)`.

We will also learn about Kubernetes to know about this deployment and services and we  <br>
will write `Ansible playbooks` with it, we will also write `Dockerfile`.

## Agenda 

 - When the developer writes a Docker file, he pushes it to the `GitHub repository`  <br>
   so whenever there is a new commit to the GitHub repo When the new code arrives it  <br>
   Notifies Jenkins via a webhook, and Jenkins starts the pipeline.

 - Jenkins pulls all the code from the GitHub repository Once it's completed, it will <br>
  ssh to the ansible server so when a developer `pushes` a docker file it accesses the  <br>
  Ansible server and starts running the image.

 - When it gets the docker file it starts building the image based on the docker file It  <br>
  tags it, and once `tagged` it pushes to the Docker hub and the second task of the Ansible  <br>
  Server is, it will ssh to our Kubernetes cluster server, which will evaluate and ansible  <br>
  will execute the playbook.

 - It runs the `kubectl` command on our Kubernetes cluster(web app) and it tries to get the  <br>
  latest image from the docker registry .It will pull from the docker hub and it will start <br>
  building the image, it will build a container and that container should be available to <br>
  us using an `node IP` and a `port` which we specified in the `Service.yaml`

 - We're going to start by writing `Service.yaml` and hand it over to the Kubernetes cluster <br>
  So this is the whole scenario in simple terms was going to achieve a `Kubernetes deployment`

 - The Jenkins CI/CD pipeline uses various tools We use `Linux` commands, Jenkins, and Docker <br>
   and you need to have a `Dockerhub account`, so once `Ansible Server` builds a Docker image <br>
   based on the Docker file, we push it to the Docker Hub.

 - So we need to log in to Docker Hub here so we can easily push the latest image so what  <br>
   we're trying to accomplish here is we have the latest image and we also maintain a <br>
   version based on the build

 - It builds v1, it contains a fresh image, If the second time it builds another image v2 <br>
 so that the second contains the latest image, we are `performing a version`, also, we have <br>
 to separate the `latest image`.
 
## Project is divided into 6 parts

- [Server Setup](https://github.com/Krishnamohan-Yerrabilli/Deployment-on-K8s-cluster-using-jenkins-CI-CD/tree/main/Server%20Setup) 
- [Dockerfile - Configure Webhook - Trigger Jenkins Job - git](https://github.com/Krishnamohan-Yerrabilli/Deployment-on-K8s-cluster-using-jenkins-CI-CD/tree/main/Dockerfile%20-%20Configure%20Webhook%20-%20Trigger%20Jenkins%20Job%20-%20git) 
- [Transfer & Execute files on remote server using SshAgent](https://github.com/Krishnamohan-Yerrabilli/Deployment-on-K8s-cluster-using-jenkins-CI-CD/tree/main/Transfer%20%26%20Execute%20files%20on%20remote%20server%20using%20SshAgent)
- [Build docker Images using Dockerfile - Tag docker images](https://github.com/Krishnamohan-Yerrabilli/Deployment-on-K8s-cluster-using-jenkins-CI-CD/tree/main/Build%20docker%20Images%20using%20Dockerfile%20-%20Tag%20docker%20images)
- [Complete Declarative CI/CD Pipelines in Jenkins Project - Push Images to DockerHub](https://github.com/Krishnamohan-Yerrabilli/Deployment-on-K8s-cluster-using-jenkins-CI-CD/tree/main/Complete%20Declarative%20CI-CD%20Pipelines%20in%20Jenkins%20Project%20-%20Push%20Images%20to%20DockerHub)
- [Complete Deployment on Kubernetes cluster using jenkins CI/CD](https://github.com/Krishnamohan-Yerrabilli/Deployment-on-K8s-cluster-using-jenkins-CI-CD/tree/main/Complete%20Deployment%20on%20Kubernetes%20cluster%20using%20jenkins%20CI-CD)

## ❤ Show your support

Give a ⭐️ if this project helped you, Happy learning!
