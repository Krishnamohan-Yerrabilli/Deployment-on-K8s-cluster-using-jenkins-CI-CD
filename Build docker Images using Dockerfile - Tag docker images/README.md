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

### Select configure in the pipeline we created

![2-select-configure-in-the-pipeline-we-created](https://user-images.githubusercontent.com/58173938/197314672-f98aa228-e4b1-4881-b9fd-3ea562edf357.png)

### Build the docker image by adding the stage block 

![3-build the docker imageby adding the stage block going home building the image](https://user-images.githubusercontent.com/58173938/197314749-5ce23783-c7bd-4834-97bd-66e0409ac592.png)

### Apply and save the changes

![4-apply and save the changes](https://user-images.githubusercontent.com/58173938/197314784-7ca247f7-02f1-427a-89b5-c9964e0ecf2b.png)

### Trobuleshoot the fail build

![4-trobule-shooting-the-error](https://user-images.githubusercontent.com/58173938/197314895-8a6e663e-7160-4618-8f8a-af9be00749d4.png)

### Changing into private ip

![5-changin-into-private-ip](https://user-images.githubusercontent.com/58173938/197314843-566f367b-0d09-46c4-8a8a-48c9f106dd1b.png)

### Error-solved-build-successful and here is the [solution](https://www.reddit.com/user/Mohanse7/comments/y9ocfs/solution_permission_was_denied_while_trying_to/) I posted in reddit 

![6-errors-solved-build-successful-and-solution](https://user-images.githubusercontent.com/58173938/197314956-e587a2cf-9474-43c2-9f9c-3aefc10a37db.png)





