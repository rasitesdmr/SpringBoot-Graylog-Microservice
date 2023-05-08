# 🎯 GRAYLOG NEDİR ?

<p align ="center">
<img src = "https://github.com/rasitesdmr/SpringBoot-Graylog-Microservice/blob/master/images/gr1.png">
</p>

* Graylog, açık kaynaklı ve merkezi bir log yönetim platformudur.

* Loglar, uygulamalar ve sistemler tarafından oluşturulan zaman damgalı olay ve hata kayıtlarıdır.

* Graylog, bu logları toplar, işler, depolar ve analiz eder, böylece ekipler, sistem performansını ve güvenliğini
  değerlendirebilir, sorunları tespit edip çözebilir ve uyumluluk gerekliliklerini karşılayabilir.

* Graylog, özellikle büyük ölçekte çalışan ve çok sayıda log verisi üreten sistemlerde değerlidir.

* Graylog, özellikle GELF (Graylog Extended Log Format) adı verilen kendi yapılandırılmış log formatını kullanarak
  logların daha kolay ve verimli bir şekilde işlenmesini ve analiz edilmesini sağlar.

* Graylog'un temel bileşenleri şunlardır:

| Terms                 | Explanation                                                                                                 |
|-----------------------|-------------------------------------------------------------------------------------------------------------|
| `Log Toplayıcılar`    | Çeşitli kaynaklardan logları toplayıp Graylog'a gönderen araçlar.                                           |
| `Elasticsearch`       | Log verilerini depolamak ve indekslemek için kullanılan ölçeklenebilir bir arama ve analiz motoru.          |
| `MongoDB`             | Graylog'un yapılandırma ve meta verilerini saklamak için kullanılan NoSQL veritabanı.                       |
| `Graylog Sunucusu`    | Logları işleyen, analiz eden ve yöneten ana bileşen.                                                        |
| `Graylog Web Arayüzü` | Kullanıcıların log verilerini arayabileceği, görselleştirebileceği ve yönetebileceği bir webtabanlı arayüz. |

# 🎯 MONGODB NEDEN KULLANILIR ?

<p align ="center">
<img src = "https://github.com/rasitesdmr/SpringBoot-Graylog-Microservice/blob/master/images/gr2.png">
</p>

* Graylog'da MongoDB, yapılandırma ve meta verilerini saklamak için kullanılır.

* Graylog'un sistem yapılandırması, kullanıcı hesapları, roller ve izinler, uyarılar ve bildirimler gibi önemli meta
  verileri MongoDB'de depolanır.

* Bu veriler, Graylog'un düzgün çalışabilmesi ve kullanıcıların yönetim ve izleme işlemlerini gerçekleştirebilmesi için
  gereklidir.

# 🎯 GELF NEDİR ?

<p align ="center">
<img src = "https://github.com/rasitesdmr/SpringBoot-Graylog-Microservice/blob/master/images/gr4.png">
</p>

* GELF (Graylog Extended Log Format), Graylog tarafından geliştirilmiş bir log formatıdır.

* GELF, yapılandırılmış log verilerini taşımak ve iletmek için tasarlanmıştır ve diğer log formatlarından daha fazla
  özellik ve esneklik sunar.

* GELF'in temel avantajları şunlardır:

| Terms                  | Explanation                                                                                                                                                                      |
|------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `Yapılandırılmış Veri` | GELF, log verilerini JSON biçiminde yapılandırır, bu da verilerin daha kolay işlenmesini, analiz edilmesini ve saklanmasını sağlar.                                              |
| `Büyük Mesajlar`       | GELF, büyük boyutlu log mesajlarını destekler ve gerektiğinde mesajları parçalara ayırarak (chunking) ağ üzerinde daha verimli bir şekilde iletmeye olanak tanır.                |
| `Ek Bilgiler`          | GELF, standart log formatlarına ek olarak ek bilgiler (metadata) eklemeyi destekler. Bu, daha detaylı bilgilere erişmeyi ve loglar arasındaki ilişkileri anlamayı kolaylaştırır. |
| `Sıkıştırma`           | GELF, log verilerini sıkıştırmayı destekler, bu da ağ üzerinde daha düşük bant genişliği kullanımı ve daha hızlı iletim sağlar.                                                  |
| `Uyumluluk`            | GELF, Graylog, Logstash ve diğer log yönetimi sistemleriyle uyumludur, bu da farklı ortamlarda ve sistemlerde çalışabilme yeteneği sunar.                                        |

# 🎯 ELASTICSEARCH NEDEN KULLANILIR ?

<p align ="center">
<img src = "https://github.com/rasitesdmr/SpringBoot-Graylog-Microservice/blob/master/images/gr3.png">
</p>

* Graylog'da Elasticsearch, log verilerini depolamak, indekslemek ve hızlı sorgulamalar yapmak için kullanılır.

* Elasticsearch, ölçeklenebilir ve esnek bir yapı sunarak büyük miktarda log verisini yönetmeyi ve analiz etmeyi
  kolaylaştırır.

* Graylog ile Elasticsearch'in birlikte kullanılmasının temel nedenleri şunlardır:

| Terms               | Explanation                                                                                                                                                                                                                  |
|---------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `Ölçeklenebilirlik` | Elasticsearch, büyük miktarda veriyi yönetebilir ve depolayabilir. Bu sayede, Graylog büyükölçekli projelerde ve çok sayıda log verisi üreten sistemlerde etkili bir şekilde kullanılabilir.                                 |
| `Hızlı Aramalar`    | Elasticsearch, verileri indeksleyerek hızlı ve etkili aramalar yapmayı sağlar. Bu sayede,kullanıcılar Graylog aracılığıyla loglarda belirli olayları veya hataları hızlı bir şekilde bulabilir ve analiz edebilir.           |
| `Esneklik`          | Elasticsearch, yapılandırılmış ve yapılandırılmamış verileri depolayabilme ve arayabilme yeteneği sunar. Bu, Graylog'un farklı kaynaklardan gelen log verilerini yönetmesini ve analiz etmesini sağlar.                      |
| `Yüksek Uyumluluk`  | Elasticsearch, Graylog'un kendi yapılandırılmış log formatı olan GELF (Graylog Extended Log Format) ile uyumludur. Bu sayede Graylog, Elasticsearch ile kolayca entegre edilerek daha etkili log yönetimi ve analizi sunar.  |
| `Veri Analizi`      | Elasticsearch, log verilerini analiz etmek ve görselleştirmek için çeşitli araçlar ve özellikler sunar. Bu, Graylog'un kullanıcılarına daha derinlemesine analiz ve anlayış sağlamasına yardımcı olur.                       |

## 📌 Proje Hakkında Özet ?

<p align ="center">
<img src = "https://github.com/rasitesdmr/SpringBoot-Elasticsearch-Logstash-Kibana-ELK/blob/master/images/elk5.png">
</p>

* docker-compose.yaml

```yaml
docker-compose -f docker-compose.dev.yaml up -d
docker-compose -f docker-compose.graylog.yaml up -d
```

```yaml
docker-compose -f docker-compose.dev.yaml down -v
docker-compose -f docker-compose.graylog.yaml down -v
```

⏭️Client Swagger : http://localhost:1000/swagger-ui.html

⏭️Graylog Web : http://localhost:9000

* username : admin
* password : admin

## 📌 System Input

<p align ="center">
<img src = "https://github.com/rasitesdmr/SpringBoot-Graylog-Microservice/blob/master/images/gr5.png">
</p>

<p align ="center">
<img src = "https://github.com/rasitesdmr/SpringBoot-Elasticsearch-Logstash-Kibana-ELK/blob/master/images/elk6.png">
</p>

<p align ="center">
<img src = "https://github.com/rasitesdmr/SpringBoot-Graylog-Microservice/blob/master/images/gr6.png">
</p>

<p align ="center">
<img src = "https://github.com/rasitesdmr/SpringBoot-Graylog-Microservice/blob/master/images/gr7.png">
</p>

# 🎯 GRAYLOG VE ELK MEMORY ÖLÇÜMÜ ?

⏭   http://localhost:1002/swagger-ui/index.html

<p align ="center">
<img src = "gr8">
</p>

* Docker container'larının ne kadar RAM kullandığını görmek için docker stats komutunu kullanabilirsiniz. Bu komut,
  çalışan tüm container'ların sistem kaynaklarını izlemenize yardımcı olur.

```shell
docker stats
```

## 📌 Graylog ile 100000 tane log gönderirsem ne olur ?

<p align ="center">
<img src = "https://github.com/rasitesdmr/SpringBoot-Graylog-Microservice/blob/master/images/gr8.png">
</p>

* Şuan herhangi bir log girişi olmuyor.

```shell
CONTAINER ID   NAME                                              CPU %     MEM USAGE / LIMIT     MEM %     NET I/O           BLOCK I/O   PIDS
ab4a9113156d   springboot-graylog-microservice-graylog-1         8.30%     610.1MiB / 7.711GiB   7.73%     18.9MB / 26.8MB   0B / 0B     220
23e8bed7e99b   springboot-graylog-microservice-mongodb-1         2.77%     86.04MiB / 7.711GiB   1.09%     18.9MB / 16.6MB   0B / 0B     47
b1987fa43fc9   springboot-graylog-microservice-elasticsearch-1   1.35%     853.4MiB / 7.711GiB   10.81%    850kB / 907kB     0B / 0B     84
0c638f4f34f5   postgresqlDb                                      0.00%     82.38MiB / 7.711GiB   1.04%     63kB / 53.8kB     0B / 0B     36
```

* 100000 tane log gönderelim.

```shell
CONTAINER ID   NAME                                              CPU %     MEM USAGE / LIMIT     MEM %     NET I/O           BLOCK I/O   PIDS
ab4a9113156d   springboot-graylog-microservice-graylog-1         205.82%   677.7MiB / 7.711GiB   8.58%     40.9MB / 82.9MB   0B / 0B     220
23e8bed7e99b   springboot-graylog-microservice-mongodb-1         1.56%     86.53MiB / 7.711GiB   1.10%     19.8MB / 17.6MB   0B / 0B     47
b1987fa43fc9   springboot-graylog-microservice-elasticsearch-1   219.09%   1.053GiB / 7.711GiB   13.66%    56MB / 1.7MB      0B / 0B     85                             
```

## 📌 Elk ile 100000 tane log gönderirsem ne olur ?

* Şuan herhangi bir log girişi olmuyor.

```shell
CONTAINER ID   NAME                       CPU %     MEM USAGE / LIMIT     MEM %     NET I/O           BLOCK I/O   PIDS
2f94abe4cb85   postgresqlDb               0.00%     35.01MiB / 7.711GiB   0.44%     67.3kB / 56.7kB   0B / 0B     6
ad94e99ab843   elasticsearch_springboot   281.34%   872.5MiB / 7.711GiB   11.05%    1.17kB / 0B       0B / 0B     62
fc5e27433914   kibana_springboot          107.83%   240.3MiB / 7.711GiB   3.04%     726B / 0B         0B / 0B     12
b1864b89aece   logstash_springboot        362.89%   391.8MiB / 7.711GiB   4.96%     726B / 0B         0B / 0B     22
```

* 100000 tane log gönderelim.

```shell
CONTAINER ID   NAME                       CPU %     MEM USAGE / LIMIT     MEM %     NET I/O           BLOCK I/O   PIDS
b1864b89aece   logstash_springboot        380.98%   618.9MiB / 7.711GiB   7.84%     26.6MB / 35.1MB   0B / 0B     63
fc5e27433914   kibana_springboot          3.14%     351.3MiB / 7.711GiB   4.45%     669kB / 5.55MB    0B / 0B     12
ad94e99ab843   elasticsearch_springboot   307.88%   1.013GiB / 7.711GiB   13.14%    84.6MB / 2.12MB   0B / 0B     127
2f94abe4cb85   postgresqlDb               0.00%     82.6MiB / 7.711GiB    1.05%     149kB / 128kB     0B / 0B     36
```