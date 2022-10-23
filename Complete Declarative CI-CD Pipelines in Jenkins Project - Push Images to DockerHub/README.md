<div align="center">

# Complete Declarative CI-CD Pipelines in Jenkins Project - Push Images to DockerHub

![Kubernetes final image (11)](https://user-images.githubusercontent.com/58173938/197372041-1d2188e6-32bf-414f-a452-6ed3208d0bdb.png)
 
</div>

I already stated we need to have a Dockerhub account, so once <br>
Ansible Server builds a Docker image based on the Docker file, we push it to Docker Hub. 

So we need to log in to DockerHub, therfore we can easily push the latest image <br>
what we're trying to accomplish here is we have the latest image and we also <br>
maintain a version based on the build

It builds v1, it contains a fresh image

If the second time it builds another image v2, so that the second one contains the latest <br>
image, we're also maintaining version control, cause we also see how to separate the latest image <br>
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




