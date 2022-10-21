<div align="center">

## Transfer & Execute files on remote server using SshAgent
  
![3rd](https://user-images.githubusercontent.com/58173938/197097802-7b11d72a-86a8-4203-b7b8-39d2bb6c0f2b.png)
We will see, how we can send our docker file to the ansible using ssh agent <br>  
  
</div>

#### Go to Jenkins and select configure

![1-Go-to-Jenkins-and-select-configure](https://user-images.githubusercontent.com/58173938/197098191-c399d4a0-2d57-4d04-bed9-53a1c81da4ca.png)

#### Define new task (stage) block

![2-define,new,task(stage)](https://user-images.githubusercontent.com/58173938/197098486-e5b7fbec-215d-49fe-a294-d960968579b0.png)

#### Select SSH agent

![3-select-ssh-agent](https://user-images.githubusercontent.com/58173938/197098662-969f3490-50a9-45aa-852d-e25c6d40d31a.png)

#### Select SSH username (private-key)

![4-select-ssh-username-private-key](https://user-images.githubusercontent.com/58173938/197098807-801aed73-fbf8-41ef-8fac-8c41b8ae563a.png)

#### Select ID and description as ansible and username as ubuntu

![5-select-id-as-ans-same-des-username-as-ubuntu](https://user-images.githubusercontent.com/58173938/197098990-3f70d043-a268-4b02-b7fb-b4c528a2111f.png)

#### Select the key

![6-select-the-key](https://user-images.githubusercontent.com/58173938/197099292-8e2687d1-cd1f-430b-b4eb-e4c1e50e57c7.png)

#### Copy all the secret

![7-copy-all-the-secret](https://user-images.githubusercontent.com/58173938/197099370-9f1ee08c-ac0c-4c07-9f89-be654e2900f7.png)

#### Paste the all the data-inside key field and select add

![8-paste the all the data-inside key field and select add](https://user-images.githubusercontent.com/58173938/197099488-a842ecab-8055-4824-82f0-1c86318f0ee4.png)

#### Copy the generated pipeline script

![9-copy-the-generated-pipeline-script](https://user-images.githubusercontent.com/58173938/197099660-2c31367b-e41e-4177-9f3f-4fe0bcd5cdc6.png)

#### Paste the generated pipeline script

![10-paste-the-generated-pipeline-script](https://user-images.githubusercontent.com/58173938/197099749-f5dfde90-0b15-480e-8927-0a18d9cd2cd5.png)

#### Select the ansible server Public IP

![11-select-the-ans-ser-ip](https://user-images.githubusercontent.com/58173938/197099906-27aae10f-c086-4528-9ca5-2e1017b44073.png)

#### Paste the ansible server Public IP in the Groovy script

![12-paste-the-ans-ser-ip-in-the-script](https://user-images.githubusercontent.com/58173938/197100014-42ac6550-cfeb-4eee-b875-136faa3ad3ff.png)

#### copy the path, this is the path we passing over scp(secure copy) to the ansible

![13-copythe-path, this is the path we passing over scp](https://user-images.githubusercontent.com/58173938/197100245-7fd7530b-e21d-4c18-b761-ca810c863c8b.png)









