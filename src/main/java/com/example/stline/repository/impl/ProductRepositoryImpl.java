package com.example.stline.repository.impl;

import com.example.stline.db.tables.ProductsMark_;
import com.example.stline.db.tables.records.Product___Record;
import com.example.stline.db.tables.records.ProductsCategory_Record;
import com.example.stline.db.tables.records.ProductsMark_Record;
import com.example.stline.entity.Category;
import com.example.stline.entity.Mark;
import com.example.stline.entity.Product;
import com.example.stline.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.example.stline.db.tables.Product___.PRODUCT___;
import static com.example.stline.db.tables.ProductsCategory_.PRODUCTS_CATEGORY_;
import static com.example.stline.db.tables.ProductsMark_.PRODUCTS_MARK_;

@Repository
@RequiredArgsConstructor
@Slf4j
public class ProductRepositoryImpl implements ProductRepository {

    private final DSLContext dsl;

    private Long insert(Product product) {
        Product___Record productsRecord = dsl.insertInto(
                PRODUCT___, PRODUCT___.MARK,PRODUCT___.MODEL,PRODUCT___.RANGE,PRODUCT___.CATEGORY,PRODUCT___.YEARS,PRODUCT___.PHOTO1,PRODUCT___.PHOTO2,PRODUCT___.PHOTO3)
                .values(product.getMark(),product.getModel(),product.getRange(),product.getCategory(),product.getYears(),product.getPhoto1(),product.getPhoto2(),product.getPhoto3())
                .returning(PRODUCT___.ID)
                .fetchOne();
        product.setId(productsRecord.getValue(PRODUCT___.ID));
        log.info("Insert into db: {}", product.toString());
        return productsRecord.getValue(PRODUCT___.ID);
    }

    private Long insertCategory(String name){
        ProductsCategory_Record categoryRecord = dsl.insertInto(
                PRODUCTS_CATEGORY_,PRODUCTS_CATEGORY_.NAME)
                .values(name)
                .returning(PRODUCTS_CATEGORY_.ID)
                .fetchOne();
        return categoryRecord.getId();
    }

    private Long insertMark(String name){
        ProductsMark_Record markRecord = dsl.insertInto(
                PRODUCTS_MARK_,PRODUCTS_MARK_.NAME)
                .values(name)
                .returning(PRODUCTS_MARK_.ID)
                .fetchOne();
        return markRecord.getId();
    }

    @Override
    public Product create(Product product) {
        return get(insert(product));
    }

    @Override
    public boolean update(Product product) {
        try {
             dsl.update(PRODUCT___)
                    .set(PRODUCT___.MARK, product.getMark())
                     .set(PRODUCT___.MODEL, product.getModel())
                     .set(PRODUCT___.RANGE, product.getRange())
                     .set(PRODUCT___.CATEGORY, product.getCategory())
                     .set(PRODUCT___.YEARS, product.getYears())
                     .set(PRODUCT___.PHOTO1, product.getPhoto1())
                     .set(PRODUCT___.PHOTO2, product.getPhoto2())
                     .set(PRODUCT___.PHOTO3, product.getPhoto3())
                    .where(PRODUCT___.ID.eq(product.getId())).execute();
            return true;
        }catch (Exception ex){
            log.error(ex.getMessage());
            return false;
        }

    }

    @Override
    public boolean remove(Long id) {
        try {
            dsl.delete(PRODUCT___).where(PRODUCT___.ID.eq(id)).execute();
            return true;
        }catch (Exception ex){
            log.error(ex.getMessage());
            return false;
        }
    }

    @Override
    public Product get(Long id) {
        return dsl.selectFrom(PRODUCT___)
                .where(PRODUCT___.ID.eq(id))
                .fetchOneInto(Product.class);
    }

    @Override
    public List<Product> getAll() {
        return dsl.selectFrom(PRODUCT___)
                .orderBy(PRODUCT___.ID.desc())
                .fetchInto(Product.class);
    }

    @Override
    public List<Product> searchProducts(Product product) {
//        return dsl.selectFrom(PRODUCT___)
//                .where(PRODUCT___.PRODUCT.eq(product.getProduct()))
//                .fetchInto(Product.class);
        return null;
    }

    @Override
    public Category createCategory(String name) {
        return new Category(insertCategory(name),name);
    }

    @Override
    public List<Category> getAllCategories() {
        log.info("go...db" );
        List<Category> list= dsl.selectFrom(PRODUCTS_CATEGORY_)
                .orderBy(PRODUCTS_CATEGORY_.ID.desc())
                .fetchInto(Category.class);
        log.info(list.toString());
        return list;
    }


    @Override
    public Mark createMark(String name) {
        return new Mark(insertMark(name),name);
    }

    @Override
    public List<Mark> getAllMarks() {
        return dsl.selectFrom(PRODUCTS_MARK_)
                .orderBy(PRODUCTS_MARK_.ID.desc())
                .fetchInto(Mark.class);
    }

    private String getCategoryById(Long id){
       return String.valueOf(dsl.select(PRODUCTS_CATEGORY_.NAME)
                .from(PRODUCTS_CATEGORY_)
                .where(PRODUCTS_CATEGORY_.ID.eq(id))
                .fetchOne());
    }

    private String getMarkById(Long id){
        return String.valueOf(dsl.select(PRODUCTS_MARK_.NAME)
                .from(PRODUCTS_MARK_)
                .where(PRODUCTS_MARK_.ID.eq(id))
                .fetchOne());
    }
}
