package com.devupers.Devupers.Config;
import com.mongodb.client.MongoDatabase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.convert.MongoTypeMapper;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;


@Configuration
public class Config {

    @Bean
    public MappingMongoConverter mappingMongoConverter(MongoDatabaseFactory mongoDbFactory,
                                                       MongoMappingContext mongoMappingContext) {

        MappingMongoConverter converter = new MappingMongoConverter(mongoDbFactory, mongoMappingContext);


        converter.setTypeMapper(new DefaultMongoTypeMapper(null));

        return converter;
    }
}
