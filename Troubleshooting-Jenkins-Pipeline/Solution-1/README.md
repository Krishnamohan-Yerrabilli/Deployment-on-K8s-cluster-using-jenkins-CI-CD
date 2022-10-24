# [Solution] permission was denied while trying to connect to the Docker daemon socket at unix:///var/run/docker.sock

Executed the pipeline several times but got the same error

![pic1](https://user-images.githubusercontent.com/58173938/197545055-fc90f7eb-7986-411b-9df7-020f1b620d0c.png)

Create a user in your EC2 instance named Jenkins

```
sudo adduser jenkins

```

Giving permission to Jenkins to access the docker

```
sudo usermod -a -G docker [jenkins]
```

Giving root permission to Jenkins

```
usermod -aG root jenkins
```

If none of those work for you, try the below command. this is the only thing that worked for me

```
chmod 777 /var/run/docker.sock
```

Now restart Jenkins
(jenkins_url)/safeRestart

![pic2](https://user-images.githubusercontent.com/58173938/197545098-9b3f3869-9906-4557-8c7a-90fdc34c2523.png)


This is what I learned from
*Plz note:*

```
Granting the Docker socket a very open permission, like 777, is something you may want to avoid in Prod, by doing this, you are giving the permissions to any process or user to fully access Docker. You only need to add Jenkins user to Docker group and then restart your server, that's pretty much all what you need to do. - Laith Leo Alobaidy
```

Happy learning!
