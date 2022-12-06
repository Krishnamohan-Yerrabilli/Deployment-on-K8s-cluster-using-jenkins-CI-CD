<div align="center">

# Dockerfile - Configure Webhook - Trigger Jenkins Job - git

</div>

![Kubernetes final image (10)](https://user-images.githubusercontent.com/58173938/197371867-7119edd2-215d-4362-8f6a-a7483561e34f.png)

In a typical CI/CD pipeline, what happens is when you push your code to a `code repository (remote)` 
like `GitHub/GitLab/BitBucket`, an event is triggered by the git host provider. This trigger is 
known as `WebHook`. This webhook can be used by some third-party services to provide an array of integrations.

Here the performed task is to run a build that creates a docker image and pushes it to `Docker Hub Registry`. 
From there one can pull the images to further use them for further consumption. This image is consumed by `Kubernetes cluster`


### Create a [Dockerfile](https://github.com/Krishnamohan-Yerrabilli/Deployment-on-K8s-cluster-using-jenkins-CI-CD/blob/main/Dockerfile%20-%20Configure%20Webhook%20-%20Trigger%20Jenkins%20Job%20-%20git/Dockerfile/Dockerfile)

And push the Dockerfile to a separate [Repository](https://github.com/Krishnamohan-Yerrabilli/jenkins-pipeline)

### Why we need separate repo?

#### Because it makes it easy to Jenkins to fetch the file(more on this later)

![1-Dockerfile](https://user-images.githubusercontent.com/58173938/196869950-4b9bee5c-885e-456b-8ed1-c0ab2a8b67a4.png)

#### Now login into your Jenkins account

![2-jenkins-login](https://user-images.githubusercontent.com/58173938/196870673-f1b72fa9-64a4-48d1-a6ae-1a1b2cbfb7c9.png)

#### Creating a pipeline, click on the new item

![3-creating-pipeline-new-item](https://user-images.githubusercontent.com/58173938/196874960-598d3ba3-c0f0-487a-ae23-0ba5685dc358.png)

#### Select the pipeline 

![4-select-pipeline](https://user-images.githubusercontent.com/58173938/196875229-e4a7e0d3-dd5e-49d5-8100-5e5794d94a1c.png)

#### Enter youre repo name (separate repo we created for [jenkins-pipeline](https://github.com/Krishnamohan-Yerrabilli/jenkins-pipeline))

![jp](https://user-images.githubusercontent.com/58173938/196914329-d18517f8-cb18-4674-8c51-272970f34646.png)

#### We're writing a script using groovy 

![6-groovy-script-gitcheckout](https://user-images.githubusercontent.com/58173938/196871851-67b03569-71c0-436f-a487-d37b922c1c4e.png)

#### Build is successfully 

![7-build-is-sucessfull-logs](https://user-images.githubusercontent.com/58173938/196871909-df7f8104-5465-45b1-892d-3207c157efc3.png)

#### What we have done until now is a manual process, let's automate this stuff. select configure gitSCM

![8-selectconfigure-gitscm](https://user-images.githubusercontent.com/58173938/196872231-04bc8ed2-ffee-42b7-ae05-dd9af2641789.png)

#### Configure web hook

![9-configure-webhook](https://user-images.githubusercontent.com/58173938/196872293-1ed5e5cd-fab4-4e8b-877b-63082590f34d.png)

#### To provide the `API token`(one type of secret), go to Jenkins

![10-apitoken-for-webhook-api-to-log-through](https://user-images.githubusercontent.com/58173938/196872699-ccce36cd-c7f1-4896-946c-7506cdc1a06b.png)
*Copy the API token and paste this into the GitHub webhook. secret field*

#### Save the stuff
![11-secret-in-hooks](https://user-images.githubusercontent.com/58173938/196872909-20d69f75-39a6-4370-afed-309f54a9b4e4.png)

#### Reload (You will get a successful checkmark) to sync 

![12-refreshthe-sping](https://user-images.githubusercontent.com/58173938/196873274-9bf34466-0035-4ba8-9f26-36ffb6aa1f91.png)

#### Now let's make a change in Dockerfile and push it to the separate repo we created, 
*This is the link we paste in Jenkins script*

![12-port22ssh-port-added](https://user-images.githubusercontent.com/58173938/196873168-0f988ee8-5823-4745-b43a-64db01fca136.png)

#### woohoo we successfully triggered the Jenkins, by committing a new change in the Dockerfile via GitHub

![13-succesfully-trigered](https://user-images.githubusercontent.com/58173938/196873800-b1b1f3b4-832a-4dcc-a3db-6159da095835.png)

happy learning!!
