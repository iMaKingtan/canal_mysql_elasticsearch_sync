package com.star.sync.elasticsearch.service.impl;

import com.star.sync.elasticsearch.service.ElasticsearchService;
import com.star.sync.elasticsearch.util.JsonUtil;
import org.elasticsearch.action.bulk.BulkRequestBuilder;
import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.client.RestHighLevelClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author <a href="mailto:wangchao.star@gmail.com">wangchao</a>
 * @version 1.0
 * @since 2017-08-27 12:38:00
 */
@Service
public class ElasticsearchServiceImpl implements ElasticsearchService {
    private static final Logger logger = LoggerFactory.getLogger(ElasticsearchServiceImpl.class);

    @Resource
    private RestHighLevelClient restHighLevelClient;

    /**
     * 根据id插入数据
     * @param index
     * @param id
     * @param dataMap
     */
    @Override
    public void insertById(String index, String id, Map<String, Object> dataMap) {
        // 插入文档
    }

    @Override
    public void batchInsertById(String index , Map<String, Map<String, Object>> idDataMap) {
        // 批量插入文档
//        BulkRequestBuilder bulkRequestBuilder = restHighLevelClient.prepareBulk();
//
//        idDataMap.forEach((id, dataMap) -> bulkRequestBuilder.add(restHighLevelClient.prepareIndex(index, type, id).setSource(dataMap)));
//        try {
//            BulkResponse bulkResponse = bulkRequestBuilder.execute().get();
//            if (bulkResponse.hasFailures()) {
//                logger.error("elasticsearch批量插入错误, index=" + index + ", type=" + type + ", data=" + JsonUtil.toJson(idDataMap) + ", cause:" + bulkResponse.buildFailureMessage());
//            }
//        } catch (Exception e) {
//            logger.error("elasticsearch批量插入错误, index=" + index + ", type=" + type + ", data=" + JsonUtil.toJson(idDataMap), e);
//        }
    }

    @Override
    public void update(String index , String id, Map<String, Object> dataMap) {
        this.insertById(index, id, dataMap);
    }

    @Override
    public void deleteById(String index , String id) {
        // 根据id进行删除
    }
}
