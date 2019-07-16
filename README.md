# dataservice
Датасервис для LOGerta
ОСновной раздел- https://github.com/BJCreslin/LogertaMicroservice/blob/master/README.md  

REST Микрсосервис хранения данных в базе данных.
БД- Postgresql.
Технологии- springboot, JPA, WEb, TomCat  Lombok.

DTO- https://github.com/BJCreslin/dataservice/blob/master/src/main/java/ru/bjcreslin/dataservice/dto/ItemDTO.java
    private String code; -Код товара на сайте магазина
    private String sku;  -артикль производителя. Может быть пустым (null).
    private String name;  - название у продавца
    private String shopName;  - название продавца
    private BigDecimal price;  - Цена
    private BigDecimal cheapPrice;  - Цена со скидкой
    private String currency; -валюта цены
    protected Boolean sale;  - В данный момент есть ли распродажа этого товара то True
    protected Long multy;  - кратность товара. Кратность товара может отличаться. Допустим, длина трубы -2 метра, и цена в магазине за 2 метра.
    private String address; -Webaddress товара
    private String imgAddress;  -адрес картинки в файловом пространстве или html 
    private Set<Long> relatedData;  -список связанных значений . Хранятся коды связанных товаров. Связанный товары-товары из разных магазинов,
          которые носят разное название , могут быть разногопроизводства, но по сути одно и то же. Например Кран шаровый itap VIENNA 1/2" ГГ бп баб. и
          Кран шаровой полнопроходной ручка бабочка, В-В 1/2 СБ .
    private LocalDateTime date;  -дата последнего обновления данных
    private String Comment; -Коментарий. Без коментариев .
