<div align="center">

## Complete Deployment on Kubernetes cluster using jenkins CI-CD

![197373162-1f510766-4437-41ba-b6f8-deead93c7693](https://user-images.githubusercontent.com/58173938/197495878-0be968d0-2c33-4c26-b6fb-5a20b825c646.png)

</div>

We will see how jenkins transfer the files, also will see another job of ansible is to run the 
playbook principle so what are the files are going to run here is a `service.yaml` 
file and also a `deployment.yaml` file and kubernetes fetch the latest image 
from the docker registry and based on that it will start building a container 
also we have a service file so that container will be accessible to us using 
the terminal along with the node port we are going to expose 

I posted some of the troubleshoot scenerios which i have gone through on the [reddit](https://www.reddit.com/user/Mohanse7)

### Select the ansible public ip address and do ssh to the server via putty

![1-copy the ansible public ip address for ssh to the server](https://user-images.githubusercontent.com/58173938/197496057-5928e3fd-6a9d-42fb-bc6e-e38248031e1b.png)

### Select the webapp-server(k8s cluster) and do `ssh` to the server via `putty`

![2- copy the webapp-server(k8s cluster) for ssh to the server](https://user-images.githubusercontent.com/58173938/197496329-a5e59924-728c-4af2-aad1-ae2d57e42ab6.png)
 
### Now we have logged into the 2 servers right one is ansible and left one is webapp-server(k8s cluster)

![3- now we have logged into the 2 servers right one is ansible and left one is webapp-server(k8s cluster)](https://user-images.githubusercontent.com/58173938/197496413-248dee66-e90c-4703-ac65-844f083a1847.png)

### Set the root password in the webapp(k8s cluster) server

![4- set the root password in the webapp(k8s cluster) server](https://user-images.githubusercontent.com/58173938/197496499-8eef533a-718b-41a3-948c-16be6f431a01.png)

### Open sshconfig file we do this to allow network permissions

![5- open sshconfig file we do this to allow network permissions](https://user-images.githubusercontent.com/58173938/197496657-4604368b-b03d-4ca2-9b7d-002447aa496b.png)

### Enable PermitRootLogin, PasswordAuthentication to yes

![6- enable PermitRootLogin, PasswordAuthentication to yes](https://user-images.githubusercontent.com/58173938/197496738-aae168a7-b3e6-4874-b527-239d633ebef5.png)

### Now restart the sshd service 

![7- Now restart the sshd service ](https://user-images.githubusercontent.com/58173938/197496900-e7cd5063-978a-43cd-ad3b-36d7d6f76750.png)

### Genrate Public key in the ansible server

![8- Genrate Public key in the ansible server](https://user-images.githubusercontent.com/58173938/197497206-73336fd5-5e9d-4f80-ae77-d5200e89a14c.png)

### Select the ansible public generated key to the webapp server(k8s cluster) enter the password which you previously created

![9-Copy the ansible public generated key to the webapp server(k8s cluster) enter the password which you previously created](https://user-images.githubusercontent.com/58173938/197497331-5cb625d3-b9c3-4368-a2bc-0deac37a7b91.png)

### As you can see now we can ssh through other server without need of the password

![10- As you can see now we can ssh through other server without need of the password](https://user-images.githubusercontent.com/58173938/197497403-7575a61d-f475-4ff0-b0bd-77954959f8da.png)

### Go to vi etc-ansible-hosts to add ip of the webserer(k8s cluster) after that save and exit

![11- Go to vi etc-ansible-hosts to add ip of the webserer(k8s cluster) after that save and exit](https://user-images.githubusercontent.com/58173938/197497524-896af191-9bdf-4bc6-80c4-7c06942e357c.png)

### Ping the server by your group id you created in the host file on ansible server (vi etc-ansible-hosts)

![12- ping the server by your group id you created in the host file on ansible server (vi etc-ansible-hosts)](https://user-images.githubusercontent.com/58173938/197497588-7968013d-22e9-4751-aaea-668fbb1f9914.png)

### Log back to jenkins

![13- log back to jenkins](https://user-images.githubusercontent.com/58173938/197497643-443116f1-6cb1-4b1e-bafb-1f36c3b59921.png)

### Create an SSH with private key(key pair which you created for the instance)

![14- Create an SSH with private key(key pair which you created for the instance)](https://user-images.githubusercontent.com/58173938/197497711-8e011924-8b74-4ce6-b50f-c9d8563a2fae.png)

### Copy the generated script

![15- Copy the generated script](https://user-images.githubusercontent.com/58173938/197497808-c4389405-108d-4978-b698-f5f87c42753a.png)

### Make a connection bweteen jenkins and directly to the kubernetes server

![16- make a connection bweteen jenkins and directly to the kubernetes server](https://user-images.githubusercontent.com/58173938/197497885-b91a96f4-2a89-4eaa-968e-d282c8ca0e1e.png)

### As you can see, finally the pipeline was successful, I uploaded trouble shoot solutions on reddit

![17- As you can see, finally the pipeline was successful, I uploaded trouble shoot solutions on reddit](https://user-images.githubusercontent.com/58173938/197497992-85d98cd3-cba4-4938-8c7f-4709c1753109.png)

### Add the Deployment file to the jenkins-pipeline repo

![18- Add the Deployment file to the jenkins-pipeline repo](https://user-images.githubusercontent.com/58173938/197498072-d1da778b-193f-4bd2-9086-43bd9faf9373.png)

### Add the servicefile to the jenkins-pipeline repo

![19- Add the servicefile to the jenkins-pipeline repo png](https://user-images.githubusercontent.com/58173938/197498148-79973626-b457-4c3b-a585-593fea441094.png)

### Add the ansible playbook to the jenkins-pipeline repo

![20- Add the ansible playbook to the jenkins-pipeline repo png png](https://user-images.githubusercontent.com/58173938/197498255-97fd0179-d21f-4ed6-a408-5f2bd59a1091.png)

### files has been succesful deployed to all the servers pipeline was successful

![21-files has been successfully deployed to all the servers pipeline was successful](https://user-images.githubusercontent.com/58173938/197498406-456b2df0-0e97-43e8-a5dc-18879b8c72f6.png)

### Add the ansible playbook to run script

![22- Add the ansible playbook to run script](https://user-images.githubusercontent.com/58173938/197498491-d49fb0c8-a28e-4c82-9bd1-fc5f9bf0f5dc.png)

### Build is successful ansible playbook runing successfully

![23- Build is successul  ansible playbook has been runing successfully](https://user-images.githubusercontent.com/58173938/197498578-5f128a02-ff9c-4d37-b9f9-81696c91ddd8.png)

### Lets access the webpage from the nodeport service

![24-lets access the webpage from the nodeport service](https://user-images.githubusercontent.com/58173938/197498747-4fac23b9-eabb-4deb-9cc1-a9676299f31b.png)

Happy learning!

