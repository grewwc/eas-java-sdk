package com.aliyun.openservices.eas.discovery.core;

import java.util.List;

public interface Listener {

    /**
     * �����µ�endpoint�б�,�����й���
     *
     * @param endpoints
     */
    void onChange(List<Endpoint> endpoints);
}
