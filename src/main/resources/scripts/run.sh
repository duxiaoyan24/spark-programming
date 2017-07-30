spark-submit \
    --class com.duxiaoyan.spark.learn.Start \
    --master yarn-client \
    --name scala_start_duxiaoyan \
    --queue root.q_ad.q_adlog \
    --driver-memory 2G \
    --executor-memory 3G \
    --num-executors 10 \
    --executor-cores 2 \
    spark-programming.jar

