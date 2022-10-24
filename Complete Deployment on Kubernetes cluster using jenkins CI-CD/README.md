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

