package com.star.sync.elasticsearch.client;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.swing.text.Highlighter;
import java.net.InetAddress;

/**
 * @author <a href="mailto:wangchao.star@gmail.com">wangchao</a>
 * @version 1.0
 * @since 2017-08-25 17:32:00
 */
@Component
@ConfigurationProperties("elasticsearch")
public class ElasticsearchClient implements DisposableBean {
    private static final Logger logger = LoggerFactory.getLogger(ElasticsearchClient.class);
    private RestHighLevelClient restHighLevelClient;


    private String clusterName;
    private String host;
    private Integer port;

    @Bean
    public RestHighLevelClient getTransportClient() throws Exception {

        logger.info("elasticsearch transportClient 连接成功");
        restHighLevelClient = new RestHighLevelClient(RestClient.builder(new HttpHost(host,port,"http")));
        return restHighLevelClient;
    }

    @Override
    public void destroy() throws Exception {
        if (restHighLevelClient != null) {
            restHighLevelClient.close();
        }
    }
}
