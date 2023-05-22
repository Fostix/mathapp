FROM bellsoft/liberica-openjdk-alpine:20.0.1

COPY ./src ./src

RUN mkdir ./out

RUN javac -sourcepath ./src -d out ./src/ru/gb/jcore/sample/Main.java

CMD java -classpath ./out src.ru.gb.jcore.sample.Main