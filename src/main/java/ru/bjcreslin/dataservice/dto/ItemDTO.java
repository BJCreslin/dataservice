package ru.bjcreslin.dataservice.dto;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

/**
 * @version 1
 * Сущность работы с БД
 */
@Entity
@Table(name = "items")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString(callSuper = true, exclude = "innerComment")
public class ItemDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Column(name = "id")
    private long id;

    @Column(name = "code")
    private String code; //Код товара на сайте магазина

    @Column(name = "sku") //артикль производителя
    private String sku;

    @Column(name = "name") // название у продавца
    private String name;

    @Column(name = "shop_name")  // название продавца
    private String shopName;

    @Column(name = "price") // Цена
    private BigDecimal price;

    @Column(name = "cheap_price") // Цена со скидкой
    private BigDecimal cheapPrice;

    @Column(name = "currency") // валюта цены
    private String currency;

    @Column(name = "sale")  //В данный момент есть ли распродажа этого товара
    protected Boolean sale;

    @Column(name = "multy") //кратность товара
    protected Long multy;

    @Column(name = "address") //Webaddress
    private String address;

    @Column(name = "img_address") //адрес картинки в файловом пространстве или html
    private String imgAddress;

    @Column(name = "related_data") //список связанных значений
    private Set<Long> relatedData;

    @Column(name = "date") //дата последнего изменения
    private LocalDateTime date;

    @Column(name = "comment") //Коментарий
    private String comment;

    @Column(name = "inner_comment") //Внутренний коммент
    private String innerComment;

}
