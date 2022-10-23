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
