After you install jenkins on the instance, copy the public url and open it in the <br>
Browser with port 8080 

This is what you see if you successfully installed jenkins on the server

![2-sc-jenkins-gs](https://user-images.githubusercontent.com/58173938/196835061-5365f589-96f7-4ec9-99ef-e329e53e7425.png)

It takes some time to install all the required packages, Once its completed <br>
This is what you see, give you're new username and new password and mail 

![3-admin-cred](https://user-images.githubusercontent.com/58173938/196835248-82b756af-fd21-40eb-9f54-6b4385e371b3.png)

After successful completed you're registration, Now you're ready to use jenkins

![4-jenkins-ready](https://user-images.githubusercontent.com/58173938/196835346-955909ac-eb85-4466-addc-3147fec789f6.png)

Enter you're login creadintials which you created before

![5-jenkins-rtobe-used](https://user-images.githubusercontent.com/58173938/196835494-46df680a-afd1-4bb8-b867-2a152d7de7e4.png)

Now install required SSH plugin 

*Note: This is the plugin which is used to ssh to ansible by jenkins*

![6-install-plugin-sshagent](https://user-images.githubusercontent.com/58173938/196835780-bc1f795d-4d15-4e85-ac98-7ae36bb095bb.png)

After successfull installation, for changes to apply reboot jenkins

![7-installplugin-reboot](https://user-images.githubusercontent.com/58173938/196836045-19c0276b-f44f-4e9a-b14c-9ed773bb1bb1.png)

Next step:

Now ssh [Ansible Server](https://github.com/Krishnamohan-Yerrabilli/Deployment-on-K8s-cluster-using-jenkins-CI-CD/tree/main/Server%20Setup/Ansible-Provision-Setup)
