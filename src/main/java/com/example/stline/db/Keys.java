/*
 * This file is generated by jOOQ.
*/
package com.example.stline.db;


import com.example.stline.db.tables.Messages;
import com.example.stline.db.tables.Order;
import com.example.stline.db.tables.OrderDetails_;
import com.example.stline.db.tables.Posts;
import com.example.stline.db.tables.Product___;
import com.example.stline.db.tables.ProductsCategory_;
import com.example.stline.db.tables.ProductsMark_;
import com.example.stline.db.tables.Telegrammessages;
import com.example.stline.db.tables.Users;
import com.example.stline.db.tables.records.MessagesRecord;
import com.example.stline.db.tables.records.OrderDetails_Record;
import com.example.stline.db.tables.records.OrderRecord;
import com.example.stline.db.tables.records.PostsRecord;
import com.example.stline.db.tables.records.Product___Record;
import com.example.stline.db.tables.records.ProductsCategory_Record;
import com.example.stline.db.tables.records.ProductsMark_Record;
import com.example.stline.db.tables.records.TelegrammessagesRecord;
import com.example.stline.db.tables.records.UsersRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<MessagesRecord, Long> IDENTITY_MESSAGES = Identities0.IDENTITY_MESSAGES;
    public static final Identity<OrderRecord, Long> IDENTITY_ORDER = Identities0.IDENTITY_ORDER;
    public static final Identity<PostsRecord, Long> IDENTITY_POSTS = Identities0.IDENTITY_POSTS;
    public static final Identity<Product___Record, Long> IDENTITY_PRODUCT___ = Identities0.IDENTITY_PRODUCT___;
    public static final Identity<ProductsCategory_Record, Long> IDENTITY_PRODUCTS_CATEGORY_ = Identities0.IDENTITY_PRODUCTS_CATEGORY_;
    public static final Identity<ProductsMark_Record, Long> IDENTITY_PRODUCTS_MARK_ = Identities0.IDENTITY_PRODUCTS_MARK_;
    public static final Identity<UsersRecord, Long> IDENTITY_USERS = Identities0.IDENTITY_USERS;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<MessagesRecord> MESSAGES_PKEY = UniqueKeys0.MESSAGES_PKEY;
    public static final UniqueKey<OrderRecord> ORDER_PKEY = UniqueKeys0.ORDER_PKEY;
    public static final UniqueKey<OrderDetails_Record> ORDER_DETAILS__PKEY = UniqueKeys0.ORDER_DETAILS__PKEY;
    public static final UniqueKey<PostsRecord> POSTS_PKEY = UniqueKeys0.POSTS_PKEY;
    public static final UniqueKey<Product___Record> PRODUCT____PKEY = UniqueKeys0.PRODUCT____PKEY;
    public static final UniqueKey<ProductsCategory_Record> PRODUCTS_CATEGORY__PKEY = UniqueKeys0.PRODUCTS_CATEGORY__PKEY;
    public static final UniqueKey<ProductsCategory_Record> PRODUCTS_CATEGORY__NAME_KEY = UniqueKeys0.PRODUCTS_CATEGORY__NAME_KEY;
    public static final UniqueKey<ProductsMark_Record> PRODUCTS_MARK__PKEY = UniqueKeys0.PRODUCTS_MARK__PKEY;
    public static final UniqueKey<ProductsMark_Record> PRODUCTS_MARK__NAME_KEY = UniqueKeys0.PRODUCTS_MARK__NAME_KEY;
    public static final UniqueKey<TelegrammessagesRecord> TELEGRAMMESSAGES_PKEY = UniqueKeys0.TELEGRAMMESSAGES_PKEY;
    public static final UniqueKey<UsersRecord> USERS_PKEY = UniqueKeys0.USERS_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<OrderRecord, UsersRecord> ORDER__FK_ORDERS_USERID = ForeignKeys0.ORDER__FK_ORDERS_USERID;
    public static final ForeignKey<OrderDetails_Record, OrderRecord> ORDER_DETAILS___FK_ORDERS_ORDERID = ForeignKeys0.ORDER_DETAILS___FK_ORDERS_ORDERID;
    public static final ForeignKey<Product___Record, ProductsMark_Record> PRODUCT_____FK_PRODUCTS_MARK = ForeignKeys0.PRODUCT_____FK_PRODUCTS_MARK;
    public static final ForeignKey<Product___Record, ProductsCategory_Record> PRODUCT_____FK_PRODUCTS_CATEGORY = ForeignKeys0.PRODUCT_____FK_PRODUCTS_CATEGORY;
    public static final ForeignKey<TelegrammessagesRecord, PostsRecord> TELEGRAMMESSAGES__FK_TELEGRAMMESSAGES_POSTS = ForeignKeys0.TELEGRAMMESSAGES__FK_TELEGRAMMESSAGES_POSTS;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<MessagesRecord, Long> IDENTITY_MESSAGES = createIdentity(Messages.MESSAGES, Messages.MESSAGES.ID);
        public static Identity<OrderRecord, Long> IDENTITY_ORDER = createIdentity(Order.ORDER, Order.ORDER.ID);
        public static Identity<PostsRecord, Long> IDENTITY_POSTS = createIdentity(Posts.POSTS, Posts.POSTS.ID);
        public static Identity<Product___Record, Long> IDENTITY_PRODUCT___ = createIdentity(Product___.PRODUCT___, Product___.PRODUCT___.ID);
        public static Identity<ProductsCategory_Record, Long> IDENTITY_PRODUCTS_CATEGORY_ = createIdentity(ProductsCategory_.PRODUCTS_CATEGORY_, ProductsCategory_.PRODUCTS_CATEGORY_.ID);
        public static Identity<ProductsMark_Record, Long> IDENTITY_PRODUCTS_MARK_ = createIdentity(ProductsMark_.PRODUCTS_MARK_, ProductsMark_.PRODUCTS_MARK_.ID);
        public static Identity<UsersRecord, Long> IDENTITY_USERS = createIdentity(Users.USERS, Users.USERS.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<MessagesRecord> MESSAGES_PKEY = createUniqueKey(Messages.MESSAGES, "messages_pkey", Messages.MESSAGES.ID);
        public static final UniqueKey<OrderRecord> ORDER_PKEY = createUniqueKey(Order.ORDER, "order_pkey", Order.ORDER.ID);
        public static final UniqueKey<OrderDetails_Record> ORDER_DETAILS__PKEY = createUniqueKey(OrderDetails_.ORDER_DETAILS_, "order_details__pkey", OrderDetails_.ORDER_DETAILS_.ORDERID);
        public static final UniqueKey<PostsRecord> POSTS_PKEY = createUniqueKey(Posts.POSTS, "posts_pkey", Posts.POSTS.ID);
        public static final UniqueKey<Product___Record> PRODUCT____PKEY = createUniqueKey(Product___.PRODUCT___, "product____pkey", Product___.PRODUCT___.ID);
        public static final UniqueKey<ProductsCategory_Record> PRODUCTS_CATEGORY__PKEY = createUniqueKey(ProductsCategory_.PRODUCTS_CATEGORY_, "products_category__pkey", ProductsCategory_.PRODUCTS_CATEGORY_.ID);
        public static final UniqueKey<ProductsCategory_Record> PRODUCTS_CATEGORY__NAME_KEY = createUniqueKey(ProductsCategory_.PRODUCTS_CATEGORY_, "products_category__name_key", ProductsCategory_.PRODUCTS_CATEGORY_.NAME);
        public static final UniqueKey<ProductsMark_Record> PRODUCTS_MARK__PKEY = createUniqueKey(ProductsMark_.PRODUCTS_MARK_, "products_mark__pkey", ProductsMark_.PRODUCTS_MARK_.ID);
        public static final UniqueKey<ProductsMark_Record> PRODUCTS_MARK__NAME_KEY = createUniqueKey(ProductsMark_.PRODUCTS_MARK_, "products_mark__name_key", ProductsMark_.PRODUCTS_MARK_.NAME);
        public static final UniqueKey<TelegrammessagesRecord> TELEGRAMMESSAGES_PKEY = createUniqueKey(Telegrammessages.TELEGRAMMESSAGES, "telegrammessages_pkey", Telegrammessages.TELEGRAMMESSAGES.ID);
        public static final UniqueKey<UsersRecord> USERS_PKEY = createUniqueKey(Users.USERS, "users_pkey", Users.USERS.ID);
    }

    private static class ForeignKeys0 extends AbstractKeys {
        public static final ForeignKey<OrderRecord, UsersRecord> ORDER__FK_ORDERS_USERID = createForeignKey(com.example.stline.db.Keys.USERS_PKEY, Order.ORDER, "order__fk_orders_userId", Order.ORDER.USERID);
        public static final ForeignKey<OrderDetails_Record, OrderRecord> ORDER_DETAILS___FK_ORDERS_ORDERID = createForeignKey(com.example.stline.db.Keys.ORDER_PKEY, OrderDetails_.ORDER_DETAILS_, "order_details___fk_orders_orderId", OrderDetails_.ORDER_DETAILS_.ORDERID);
        public static final ForeignKey<Product___Record, ProductsMark_Record> PRODUCT_____FK_PRODUCTS_MARK = createForeignKey(com.example.stline.db.Keys.PRODUCTS_MARK__NAME_KEY, Product___.PRODUCT___, "product_____fk_products_mark", Product___.PRODUCT___.MARK);
        public static final ForeignKey<Product___Record, ProductsCategory_Record> PRODUCT_____FK_PRODUCTS_CATEGORY = createForeignKey(com.example.stline.db.Keys.PRODUCTS_CATEGORY__NAME_KEY, Product___.PRODUCT___, "product_____fk_products_category", Product___.PRODUCT___.CATEGORY);
        public static final ForeignKey<TelegrammessagesRecord, PostsRecord> TELEGRAMMESSAGES__FK_TELEGRAMMESSAGES_POSTS = createForeignKey(com.example.stline.db.Keys.POSTS_PKEY, Telegrammessages.TELEGRAMMESSAGES, "telegramMessages__fk_telegramMessages_posts", Telegrammessages.TELEGRAMMESSAGES.ID_POST);
    }
}
