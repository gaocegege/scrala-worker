FROM 1science/sbt:0.13.8-oracle-jre-8
MAINTAINER Ce Gao <ce.gao@outlook.com>

RUN mkdir -p /app

COPY ./ /app/

RUN sbt sbt-version

WORKDIR /app

CMD ["sbt", "run"]
