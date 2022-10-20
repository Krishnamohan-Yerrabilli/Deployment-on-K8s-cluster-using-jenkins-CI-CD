# Dockerfile - Configure Webhook - Trigger Jenkins Job - git

### Create a [Dockerfile](https://github.com/Krishnamohan-Yerrabilli/Deployment-on-K8s-cluster-using-jenkins-CI-CD/blob/main/Dockerfile%20-%20Configure%20Webhook%20-%20Trigger%20Jenkins%20Job%20-%20git/Dockerfile/Dockerfile)

And push the Dockerfile to a separate [Repository](https://github.com/Krishnamohan-Yerrabilli/jenkins-pipeline)

### why serparate repo?

#### Because its makes easy to jenkins to fetch the file(more on this later)

![1-Dockerfile](https://user-images.githubusercontent.com/58173938/196869950-4b9bee5c-885e-456b-8ed1-c0ab2a8b67a4.png)

#### Now login in to your Jenkins account

![2-jenkins-login](https://user-images.githubusercontent.com/58173938/196870673-f1b72fa9-64a4-48d1-a6ae-1a1b2cbfb7c9.png)

#### Creating a pipeline, click on newitem

![3-creating-pipeline-new-item](https://user-images.githubusercontent.com/58173938/196874960-598d3ba3-c0f0-487a-ae23-0ba5685dc358.png)

#### Select the pipeline 

![4-select-pipeline](https://user-images.githubusercontent.com/58173938/196875229-e4a7e0d3-dd5e-49d5-8100-5e5794d94a1c.png)


#### Enter youre repo name (separate repo we created for [jenkins-pipeline](https://github.com/Krishnamohan-Yerrabilli/jenkins-pipeline))

![5-enter-your-repo-name](https://user-images.githubusercontent.com/58173938/196871684-eeb814d4-82fe-438d-9e65-6699b43c737f.png)

#### we're writing script using groovy 

![6-groovy-script-gitcheckout](https://user-images.githubusercontent.com/58173938/196871851-67b03569-71c0-436f-a487-d37b922c1c4e.png)

#### Build is succesfully 

![7-build-is-sucessfull-logs](https://user-images.githubusercontent.com/58173938/196871909-df7f8104-5465-45b1-892d-3207c157efc3.png)

#### what we done until now is manual process, lets automate this stuff. select configure git scm

![8-selectconfigure-gitscm](https://user-images.githubusercontent.com/58173938/196872231-04bc8ed2-ffee-42b7-ae05-dd9af2641789.png)

#### Configure web hook

![9-configure-webhook](https://user-images.githubusercontent.com/58173938/196872293-1ed5e5cd-fab4-4e8b-877b-63082590f34d.png)

To provide the `api token`(one type of a secret), go to jenkins

![10-apitoken-for-webhook-api-to-log-through](https://user-images.githubusercontent.com/58173938/196872699-ccce36cd-c7f1-4896-946c-7506cdc1a06b.png)
*Copy the api-token and paste this in the github webhook.secret field*

#### Save the stuff
![11-secret-in-hooks](https://user-images.githubusercontent.com/58173938/196872909-20d69f75-39a6-4370-afed-309f54a9b4e4.png)

#### Reload to ping (You will get a succesful checkmark) after you done

![12-refreshthe-sping](https://user-images.githubusercontent.com/58173938/196873274-9bf34466-0035-4ba8-9f26-36ffb6aa1f91.png)

#### Now lets make a change in Dockerfile and push it the separate repo we created, 
*this is the link we paste in jenkins script*

![12-port22ssh-port-added](https://user-images.githubusercontent.com/58173938/196873168-0f988ee8-5823-4745-b43a-64db01fca136.png)

#### wohoo we successfully trigered the jenkins, by commiting a new change in the Dockerfile via Github

![13-succesfully-trigered](https://user-images.githubusercontent.com/58173938/196873800-b1b1f3b4-832a-4dcc-a3db-6159da095835.png)

happy learning!!


