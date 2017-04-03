FROM alpine:3.5

MAINTAINER zmatsh <zhangjianxinnet@gmail.com>

ENV TZ 'Asia/Shanghai'

RUN apk upgrade --no-cache \
    && apk add --no-cache bash tzdata openjdk8 libpcap-dev iptables \
    && ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime \
    && echo "Asia/Shanghai" > /etc/timezone \
    && rm -rf /var/cache/apk/*



ADD *.jar  /home/

ADD conf/* /home/conf/

WORKDIR /home

CMD ["java","-jar","NSS-1.0-SNAPSHOT-jar-with-dependencies.jar"]