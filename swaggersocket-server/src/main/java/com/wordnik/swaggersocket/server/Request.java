package com.wordnik.swaggersocket.server;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class Request extends ProtocolBase {

    public Request() {
    }

    private Request(Builder b) {
        headers = b.headers;
        queryString = b.queryString;
        path = b.path;
        uuid = b.uuid;
        method = b.method;
        dataFormat = b.dataFormat;
        messageBody = b.messageBody;
    }

    public final static class Builder {
        private String dataFormat = "JSON";
        private List<Header> headers = Collections.<Header>emptyList();
        private List<QueryString> queryString = Collections.<QueryString>emptyList();
        private String path = "/";
        private String uuid = UUID.randomUUID().toString();
        private String method = "POST";
        private Object messageBody = "";

        public Builder format(String dataFormat) {
            this.dataFormat = dataFormat;
            return this;
        }

        public Builder body(Object messageBody) {
            this.messageBody = messageBody;
            return this;
        }

        public Builder uuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        public Builder path(String path) {
            this.path = path;
            return this;
        }

        public Builder headers(List<Header> headers) {
            this.headers = headers;
            return this;
        }

        public Builder queryString(List<QueryString> queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder method(String method) {
            this.method = method;
            return this;
        }

        public Request build() {
            return new Request(this);
        }

    }
}
