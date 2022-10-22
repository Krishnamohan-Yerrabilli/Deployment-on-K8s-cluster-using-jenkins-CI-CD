<div align="center">

# Build docker Images using Dockerfile - Tag docker images

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
