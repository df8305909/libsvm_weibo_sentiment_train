# libsvm_weibo_sentiment_train
项目介绍：

1.这个项目为将个人整理的6万积极的（pos60000.txt）、6万消极的(neg60000.txt)微博语料作为训练语料

用中科院分词，去停用词，将原始语料做成词袋（wordss.txt）、训练数据（train.txt）

通过svm进行训练成模型（model.txt）
2.训练出的模型mode.txt 用于将测试数据进行预测，详情请看本人写的另一个项目：https://github.com/18846194802/SvmSentiment


使用：

运行Start.java

注意事项：

1.中科院分词可能过期，若过期，请到官网更新更新license（更换NLPIR.user） 地址：https://github.com/NLPIR-team/NLPIR/tree/master/License
2.训练时间比教久，请耐心等待
