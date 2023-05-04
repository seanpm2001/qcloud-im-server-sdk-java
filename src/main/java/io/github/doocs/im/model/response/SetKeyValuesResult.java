package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 设置单聊消息扩展-结果
 *
 * @author bingo
 * @since 2022/11/2 16:32
 */
public class SetKeyValuesResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = 5029093115953963538L;
    /**
     * 返回设置扩展结果
     */
    @JsonProperty("ExtensionList")
    private List<ExtensionMsg> extensionList;

    public List<ExtensionMsg> getExtensionList() {
        return extensionList;
    }

    public void setExtensionList(List<ExtensionMsg> extensionList) {
        this.extensionList = extensionList;
    }

    @Override
    public String toString() {
        return "SetKeyValuesResult{" +
                "extensionList=" + extensionList +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                "} " + super.toString();
    }
}
