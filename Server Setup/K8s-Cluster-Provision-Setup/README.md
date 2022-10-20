Copy the Public Ip and login through putty 

![needed](https://user-images.githubusercontent.com/58173938/196837283-9f8a598c-c6d3-48e0-9687-0b084091f615.png)

To Provision Docker, Run the [script](https://github.com/Krishnamohan-Yerrabilli/Deployment-on-K8s-cluster-using-jenkins-CI-CD/blob/main/Server%20Setup/K8s-Cluster-Provision-Setup/docker-script.sh)

![11-webapp-install-docker-via script](https://user-images.githubusercontent.com/58173938/196836795-e89adf76-50bb-4db2-82fa-0e410755cce8.png)

To provision Minikube, Run the [script](https://github.com/Krishnamohan-Yerrabilli/Deployment-on-K8s-cluster-using-jenkins-CI-CD/blob/main/Server%20Setup/K8s-Cluster-Provision-Setup/minikube.sh)

![12-install-minikube-via-script](https://user-images.githubusercontent.com/58173938/196837561-1cc224d5-fd47-428c-8766-fbc8f211f7ea.png)

After succesfully provisioned minikube, check the node components using kubectl

```
kubectl get nodes
````
![15-install-minikube](https://user-images.githubusercontent.com/58173938/196837780-4da40e8d-3f40-45f3-a06e-6328f68c7e28.png)

Congrats you made it, that's it for the setup phase

