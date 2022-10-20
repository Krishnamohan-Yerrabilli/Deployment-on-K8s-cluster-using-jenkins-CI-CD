FROM  centos:latest
MAINTAINER mailtomohanse@gmail.com
RUN yum install -y httpd \
 zip\
 unzip
ADD https://github.com/Krishnamohan-Yerrabilli/static-site/archive/refs/heads/main.zip /var/www/html/
WORKDIR /var/www/html/
RUN unzip main.zip
RUN cp -rvf static-site-main/* .
RUN rm -rf static-site-main main.zip
CMD ["/usr/sbin/httpd", "-D", "FOREGROUND"]
EXPOSE 80