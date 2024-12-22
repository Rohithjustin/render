package com.devupvers.App.Config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;


@Configuration
public class Config {

    @Bean
    public MappingMongoConverter mappingMongoConverter(MongoDatabaseFactory mongoDbFactory,
                                                       MongoMappingContext mongoMappingContext) {

        MappingMongoConverter converter = new MappingMongoConverter(mongoDbFactory, mongoMappingContext);


        converter.setTypeMapper(new DefaultMongoTypeMapper(null));

        return converter;
    }
    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        MongoClient mongoClient = MongoClients.create("mongodb+srv://rohithjustin3062001:h1HtpyvrBAYIeihR@cluster0.2zwkt.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0");
        return new MongoTemplate(mongoClient, "Cluster0");
    }
}
