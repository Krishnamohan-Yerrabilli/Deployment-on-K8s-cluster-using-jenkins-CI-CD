<div align="center">

# Complete Declarative CI-CD Pipelines in Jenkins Project - Push Images to DockerHub

![Kubernetes final image (13)](https://user-images.githubusercontent.com/58173938/197373220-b2a91fbd-594b-49d7-95ff-48f642423b51.png)
 
</div>

I already stated we need to have a Dockerhub account, so once ansible Server builds a 
Docker image based on the Docker file, we push it to Docker Hub. So we need to log in to 
`DockerHub`, therfore we can easily push the latest image what we're trying to accomplish 
here is we have the latest image and we also maintain a version based on the build
It builds v1, it contains a fresh image

If the second time it builds another `image v2`, so that the second one contains the latest 
image, we're also maintaining `version control`, cause we also see how to separate the latest image 
from tagged images.

![2-dockerhub](https://user-images.githubusercontent.com/58173938/197372105-10ec86dd-e938-4da4-af91-c3ddf86d83fb.png)

### Log back to the jenkins server

![3-log-back-to-jenkins](https://user-images.githubusercontent.com/58173938/197372116-0342b76e-ed25-4a61-8cac-437cce18fc86.png)

### Password is not good, we use creditails Plugin

![4-password-isnotgood-so-we-use-creditails-plugin](https://user-images.githubusercontent.com/58173938/197372120-c4e7e76c-b1c9-4da3-b6d8-fa74f9befd22.png)

### Secret text for password plugin

![5-secret-text-for-pass-plugin](https://user-images.githubusercontent.com/58173938/197372174-529f8bb4-6a85-4e07-b0b1-97d5678b6ead.png)

### Provide your secret

![6-provide-your-secret](https://user-images.githubusercontent.com/58173938/197372194-4bafd48a-950e-491a-8868-ca2b4aef5f75.png)

### Copy the generated password

![7-copy the generated password](https://user-images.githubusercontent.com/58173938/197372206-824fb63d-b77a-4c6c-b30e-8dfaad9bf725.png)

### Password is created, now were gone push images to the docker registry

![8-password is done now we want to push the images](https://user-images.githubusercontent.com/58173938/197372223-290dd734-183a-4991-b7b9-49f2883c6947.png)

### We docker push script sh intiated

![9-we docker push script sh intiated](https://user-images.githubusercontent.com/58173938/197372266-b18b5d6d-071a-4322-8abb-48d6000cdbab.png)

### Save and apply 

![10-save and apply ](https://user-images.githubusercontent.com/58173938/197372286-a8fa1034-6ba0-4ff3-a67a-811ed07dc277.png)

### Copy the Public ip to ssh to the server

![11-copy the public ip and ssh to the server](https://user-images.githubusercontent.com/58173938/197372300-470c8262-4365-4428-a39c-cb68552a26d3.png)

### Enter your dockerhub crenditails for authentication purposes

![12- enter your dockerhub crenditails](https://user-images.githubusercontent.com/58173938/197372320-6247231c-d9ff-43ba-9d14-34d72e2b41e7.png)

### Select buildnow to do all the work that we assigned to the jenkins

![13- now select buildnow to do all the work we assigned to the jenkins](https://user-images.githubusercontent.com/58173938/197372343-84fe97fa-ad5b-4f6a-94e2-28707e86fbf5.png)

### Image has been successfully pushed to docker hub

![14- see now image has been succesfully pushed to docker hub](https://user-images.githubusercontent.com/58173938/197372427-5a026a10-87fe-42b4-875e-7647169b80e6.png)

Happy learning!!




