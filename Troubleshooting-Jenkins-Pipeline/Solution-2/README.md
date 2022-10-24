# Troubleshooting(fixing SSM Agent): How to perform ssh login into an EC2 instance

if You are not able to ssh for ubuntu 18> images?, its because `AWS removed SSM Agent`

So, to install SSM Agent, copy and paste these commands, when you create an ec2 instance

Below following cmd can be performed on a wide range of `Ubuntu Servers` including 20.10 STR & 20.04, 18.04, and 16.04 LTS 64-bit (Snap)


```
sudo snap install amazon-ssm-agent --classic
sudo snap list amazon-ssm-agent
sudo snap start amazon-ssm-agent
sudo snap services amazon-ssm-agent
```

When you create ec2, you want to input these commands under the `Advanced details` 


![pic 3 added](https://user-images.githubusercontent.com/58173938/197546327-9775f0db-a1f3-43d4-91cc-b0c833f88ed2.png)


Hope you learn something new today happy learning
