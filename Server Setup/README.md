<div align="center">

## Pre-Setup

 <a href="https://github.com/Krishnamohan-Yerrabilli/Deployment-on-K8s-cluster-using-jenkins-CI-CD/tree/main/Server%20Setup">
    <img src="https://res.cloudinary.com/hy4kyit2a/f_auto,fl_lossy,q_70/learn/modules/aws-storage/choose-the-right-storage-service/images/23503c0e213838f002f2ba4821871597_4-c-068800-faf-9-4-c-3-d-85-c-5-a-9985-ed-4700-a.png" alt="kuber" width="200" height="200">
</div>


Provision `3 EC2 instances` For this project purpose, set security groups to allow all incoming traffic, for all 3 instances Setup `2 instances` for Jenkins(Jenkins-server) and ansible(Ansible-server) (use `t2.micro`) for both instances, give `volume 10GB` per instance `Setup 1 instance` for (Webapp-server)k8s cluster (use `t2.medium`) 25GB for the instance For this project purpose, `set security groups to allow all incoming traffic`
<br>

![Provision-EC2](https://user-images.githubusercontent.com/58173938/196746222-fc3342f2-9e7e-43a3-978b-9ace8aebe186.png)

If you're facing any difficulty to ssh, checkout my trobuleshooting [guide](https://www.reddit.com/user/Mohanse7/comments/y7uu26/troubleshootingfixing_ssm_agent_how_to_perform/)

## Install putty on you're local machine or on you're type2 hypervisor


![Putty](https://user-images.githubusercontent.com/58173938/196749934-9f174ba0-8eb0-4454-8689-a64d0b3c3e75.png)

To install putty simply run this [script](https://github.com/Krishnamohan-Yerrabilli/Deployment-on-K8s-cluster-using-jenkins-CI-CD/blob/main/Server%20Setup/PuTTYSSH-Client/putty-script.sh) in you're terminal 

After sucessfull installation type `putty` in the respected fiels, enter putty in search bar <br>
or enter putty in you're terminal
<br />

<div align="center">
  <img src="https://user-images.githubusercontent.com/58173938/196961621-7eccbd18-8afc-4591-8879-878223e20c18.png" alt="Logo" >
</div>

Before you copy your instance Public Ip address, make sure you download `.ppk` key-pair 
 
select the respective Instance public Ip address 
 
![Publicip](https://user-images.githubusercontent.com/58173938/196752930-0b1bf2c5-bb59-4e3a-b63d-81a7793ea98d.png)

Choose between raw, Telnet, rlogin, SSH, or serial connection. Enter a port number, <br>
a server hostname or IP address, and start a new session, for this context choose SSH
 
![Ip](https://user-images.githubusercontent.com/58173938/196753609-f0f8223c-29ec-48f0-a105-b8e1cf2f152c.png)
 
Paste in to the putty `hostname or Ipaddress` field, Select your `.ppk` and choose open

![selectppk](https://user-images.githubusercontent.com/58173938/196754035-352d525a-a256-47a9-b744-2c6b93bcb570.png)

After you open select a pop up will rise, select `Approve` and and now you would see <br>
`login:` in most of the cases the username will be `ubuntu`, 

Next step:

login to each ec2 instance via putty and run the selected EC2 shell script files 

![login](https://user-images.githubusercontent.com/58173938/196754983-6a26f679-839f-463b-afcc-19c6ffee605b.png)


I hope you learn something new, happy learning!!


 
