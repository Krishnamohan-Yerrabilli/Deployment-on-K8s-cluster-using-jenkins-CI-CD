#FROM  centos:latest
#MAINTAINER mailtomohan.in@gmail.com
#RUN cd /etc/yum.repos.d/

#RUN yum update -y
#RUN yum install httpd -y
#ADD https://github.com/Krishnamohan-Yerrabilli/static-site/archive/refs/heads/main.zip /var/www/html/
#WORKDIR /var/www/html/
#RUN yum install zip unzip -y
#RUN unzip main.zip
#RUN cp -rvf static-site-main/* .
#RUN rm -rf static-site-main main.zip
#CMD ["/usr/sbin/httpd", "-D", "FOREGROUND"]
#EXPOSE 80 22

#port 22 (ssh)
#port 80


#FROM  centos:latest
#MAINTAINER mailtomohanse@gmail.com
#RUN yum install -y httpd \
# zip\
# unzip
#ADD https://github.com/Krishnamohan-Yerrabilli/static-site/archive/refs/heads/main.zip /var/www/html/
#WORKDIR /var/www/html/
#RUN unzip main.zip
#RUN cp -rvf static-site-main/* .
#RUN rm -rf static-site-main main.zip
#CMD ["/usr/sbin/httpd", "-D", "FOREGROUND"]
#EXPOSE 80


FROM  centos:latest
MAINTAINER mailtomohan.in@gmail.com
RUN cd /etc/yum.repos.d/
RUN sed -i 's/mirrorlist/#mirrorlist/g' /etc/yum.repos.d/CentOS-*
RUN sed -i 's|#baseurl=http://mirror.centos.org|baseurl=http://vault.centos.org|g' /etc/yum.repos.d/CentOS-*
RUN yum install httpd -y
ADD https://www.free-css.com/assets/files/free-css-templates/download/page254/photogenic.zip /var/www/html/
WORKDIR /var/www/html/
RUN yum install zip unzip -y
RUN unzip photogenic.zip
RUN cp -rvf photogenic/* .
RUN rm -rf photogenic photogenic.zip
CMD ["/usr/sbin/httpd", "-D", "FOREGROUND"]
EXPOSE 80 22

#port 22 (ssh)
#port 80
