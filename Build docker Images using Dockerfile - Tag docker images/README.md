<div align="center">

# Build docker Images using Dockerfile - Tag docker images
![0-build-image](https://user-images.githubusercontent.com/58173938/197314070-ba270f97-192f-4505-810a-f1bae5b2e7a7.png)

</div>

Today we build the image based on the docker file along with the tag mainly <br>
doing this for version maintaining

will have a job based on the build number, it will have a tag with the image we will use the <br> 
pipeline job name along with that we will have the build number so how many times we are <br>
running the pipeline you will get the number jenkins-pipeline:1.1 jenkins-pipeline:1.2 

This is what we get along with that, for each and every tag 1.3 also you will get a <br>
latest image for 1.4 also you will get the latest image and so on... 

while we going through that process we are maintaining a version of the image so that at any <br>
point of time we can do roll back, let's hop into it.

### Select our Jenkins Pipeline

![1-select-our-jenkins-pipeline](https://user-images.githubusercontent.com/58173938/197314551-1494d93d-553e-4a52-8923-b81f681a9d70.png)
