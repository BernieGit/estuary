package com.neighborhood.aka.laplce.estuary.web.bean;

import com.neighborhood.aka.laplce.estuary.bean.identity.DataSyncType;

import java.nio.charset.Charset;


/**
 * Created by john_liu on 2018/3/11.
 */
public class Mysql2kafkaTaskRequestBean {
    private String journalName;
    private long Position;
    private long timeStamp;
    private boolean isCounting;
    private boolean isProfiling;
    private boolean isTransactional;
    private long batchThreshold;
    private String filterPattern;
    private String filterBlackPattern;
    private String defaultConnectionTimeoutInSeconds;
    private int receiveBufferSize = 16 * 1024 * 1024;
    private int sendBufferSize = 16 * 1024;
    private boolean filterQueryDcl = false;
    private boolean filterQueryDml = false;
    private boolean filterQueryDdl = false;
    private boolean filterRows = false;
    private boolean filterTableError = false;
    private String eventFilterPattern = "";
    private String eventBlackFilterPattern = "";
    private String bootstrapServers = "";
    private String maxBlockMs = "";
    private String ack = "";
    private String lingerMs = "";
    private String kafkaRetries = "";
    private String topic = "";
    private String Mysqladdress;
    private int mysqlPort;
    private String mysqlUsername;
    private String mysqlPassword;
    private String mysqlDefaultDatabase;
    private int listenTimeout = 5000;
    private int listenRetrytime = 3;
    // 支持的binlogImage
    // binlog.images = ""
    //支持的binlogFormat
    // binlog.format = ""
    //zookeeper地址,可以设置多个，用";"分隔
    private String zookeeperServers = "10.10.248.207:2181;10.10.237.78:2181";
    // zookeeper 链接超时设置,单位毫秒
    private int zookeeperTimeout = 10000;

    public int getListenTimeout() {
        return listenTimeout;
    }

    public void setListenTimeout(int listenTimeout) {
        this.listenTimeout = listenTimeout;
    }

    public int getListenRetrytime() {
        return listenRetrytime;
    }

    public void setListenRetrytime(int listenRetrytime) {
        this.listenRetrytime = listenRetrytime;
    }

    public String getZookeeperServers() {
        return zookeeperServers;
    }

    public void setZookeeperServers(String zookeeperServers) {
        this.zookeeperServers = zookeeperServers;
    }

    public int getZookeeperTimeout() {
        return zookeeperTimeout;
    }

    public void setZookeeperTimeout(int zookeeperTimeout) {
        this.zookeeperTimeout = zookeeperTimeout;
    }


    public String getJournalName() {
        return journalName;
    }

    public void setJournalName(String journalName) {
        this.journalName = journalName;
    }

    public long getPosition() {
        return Position;
    }

    public void setPosition(long position) {
        Position = position;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public boolean isCounting() {
        return isCounting;
    }

    public void setCounting(boolean counting) {
        isCounting = counting;
    }

    public boolean isProfiling() {
        return isProfiling;
    }

    public void setProfiling(boolean profiling) {
        isProfiling = profiling;
    }

    public boolean isTransactional() {
        return isTransactional;
    }

    public void setTransactional(boolean transactional) {
        isTransactional = transactional;
    }

    public long getBatchThreshold() {
        return batchThreshold;
    }

    public void setBatchThreshold(long batchThreshold) {
        this.batchThreshold = batchThreshold;
    }

    public String getFilterPattern() {
        return filterPattern;
    }

    public void setFilterPattern(String filterPattern) {
        this.filterPattern = filterPattern;
    }

    public String getFilterBlackPattern() {
        return filterBlackPattern;
    }

    public void setFilterBlackPattern(String filterBlackPattern) {
        this.filterBlackPattern = filterBlackPattern;
    }

    public String getDefaultConnectionTimeoutInSeconds() {
        return defaultConnectionTimeoutInSeconds;
    }

    public void setDefaultConnectionTimeoutInSeconds(String defaultConnectionTimeoutInSeconds) {
        this.defaultConnectionTimeoutInSeconds = defaultConnectionTimeoutInSeconds;
    }

    public int getReceiveBufferSize() {
        return receiveBufferSize;
    }

    public void setReceiveBufferSize(int receiveBufferSize) {
        this.receiveBufferSize = receiveBufferSize;
    }

    public int getSendBufferSize() {
        return sendBufferSize;
    }

    public void setSendBufferSize(int sendBufferSize) {
        this.sendBufferSize = sendBufferSize;
    }

    public boolean isFilterQueryDcl() {
        return filterQueryDcl;
    }

    public void setFilterQueryDcl(boolean filterQueryDcl) {
        this.filterQueryDcl = filterQueryDcl;
    }

    public boolean isFilterQueryDml() {
        return filterQueryDml;
    }

    public void setFilterQueryDml(boolean filterQueryDml) {
        this.filterQueryDml = filterQueryDml;
    }

    public boolean isFilterQueryDdl() {
        return filterQueryDdl;
    }

    public void setFilterQueryDdl(boolean filterQueryDdl) {
        this.filterQueryDdl = filterQueryDdl;
    }

    public boolean isFilterRows() {
        return filterRows;
    }

    public void setFilterRows(boolean filterRows) {
        this.filterRows = filterRows;
    }

    public boolean isFilterTableError() {
        return filterTableError;
    }

    public void setFilterTableError(boolean filterTableError) {
        this.filterTableError = filterTableError;
    }

    public String getEventFilterPattern() {
        return eventFilterPattern;
    }

    public void setEventFilterPattern(String eventFilterPattern) {
        this.eventFilterPattern = eventFilterPattern;
    }

    public String getEventBlackFilterPattern() {
        return eventBlackFilterPattern;
    }

    public void setEventBlackFilterPattern(String eventBlackFilterPattern) {
        this.eventBlackFilterPattern = eventBlackFilterPattern;
    }

    public String getMysqladdress() {
        return Mysqladdress;
    }

    public void setMysqladdress(String mysqladdress) {
        Mysqladdress = mysqladdress;
    }

    public int getMysqlPort() {
        return mysqlPort;
    }

    public void setMysqlPort(int mysqlPort) {
        this.mysqlPort = mysqlPort;
    }

    public String getMysqlUsername() {
        return mysqlUsername;
    }

    public void setMysqlUsername(String mysqlUsername) {
        this.mysqlUsername = mysqlUsername;
    }

    public String getMysqlPassword() {
        return mysqlPassword;
    }

    public void setMysqlPassword(String mysqlPassword) {
        this.mysqlPassword = mysqlPassword;
    }

    public String getMysqlDefaultDatabase() {
        return mysqlDefaultDatabase;
    }

    public void setMysqlDefaultDatabase(String mysqlDefaultDatabase) {
        this.mysqlDefaultDatabase = mysqlDefaultDatabase;
    }

    public String getBootstrapServers() {
        return bootstrapServers;
    }

    public void setBootstrapServers(String bootstrapServers) {
        this.bootstrapServers = bootstrapServers;
    }

    public String getMaxBlockMs() {
        return maxBlockMs;
    }

    public void setMaxBlockMs(String maxBlockMs) {
        this.maxBlockMs = maxBlockMs;
    }

    public String getAck() {
        return ack;
    }

    public void setAck(String ack) {
        this.ack = ack;
    }

    public String getLingerMs() {
        return lingerMs;
    }

    public void setLingerMs(String lingerMs) {
        this.lingerMs = lingerMs;
    }

    public String getKafkaRetries() {
        return kafkaRetries;
    }

    public void setKafkaRetries(String kafkaRetries) {
        this.kafkaRetries = kafkaRetries;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
