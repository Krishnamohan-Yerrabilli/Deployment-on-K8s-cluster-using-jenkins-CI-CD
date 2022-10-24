<div align="center">

# Build docker Images using Dockerfile - Tag docker images

![updated](https://user-images.githubusercontent.com/58173938/197371757-eac9291d-9ba1-462c-bdb2-cb1e1e00a2e3.png)

</div>

Were going to build the image based on the docker file along with the tag it's important 
to track images aka (version maintaining)will have a job based on the build number 
it will have a tag with the image we will use the pipeline job name along with 
that we will have the build number so how many times we are running the pipeline 
you will get the number `jenkins-pipeline:1.1` `jenkins-pipeline:1.2` 

This is what we get along with that, for each and every `tag 1.3` also you will get a 
latest image for `tag 1.4` also you will get the latest image and so on, while we going 
through that process we are maintaining a version of the image so that at any 
point of time we can do roll back, let's hop into it.

### Before we begun make sure you have a Dockerhub account

![dockerhub](https://user-images.githubusercontent.com/58173938/197315431-53fbe9c5-1d3e-4be7-bb4c-7ee0c5c7bb18.png)

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

### Wohoo we successfully build the image

![7-we successfully build the image](https://user-images.githubusercontent.com/58173938/197315061-8078a84e-2e22-4e03-b1e5-bfad72bfa0f0.png)

### Adding Groovy Script for tagging the image

![8 script for tag the image](https://user-images.githubusercontent.com/58173938/197315203-0f9fa87b-a237-4d64-a739-c692e1f8e36d.png)

### Now apply and save the changes

![9 now apply and save](https://user-images.githubusercontent.com/58173938/197315247-6cd7174d-7636-499f-807e-5541e5cffa3f.png)

### Now its successfull

![10 Now its successfull](https://user-images.githubusercontent.com/58173938/197315272-387f8698-b3c4-45b0-9b91-7033414811fc.png)

### Images has been successful tagged

![11-tag-images-successful](https://user-images.githubusercontent.com/58173938/197315324-8352f690-7231-48f2-a55c-e34a1de891c7.png)

That's it for this part, happy learning!!
