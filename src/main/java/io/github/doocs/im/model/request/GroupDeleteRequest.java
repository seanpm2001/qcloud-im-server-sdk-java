package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 删除分组-请求参数
 *
 * @author hyh
 * @since 2021/07/31 15:41
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupDeleteRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = 8340916110862720945L;
    /**
     * 需要删除该 UserID 的分组
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 要删除的分组列表
     */
    @JsonProperty("GroupName")
    private List<String> groupName;

    public GroupDeleteRequest() {
    }

    public GroupDeleteRequest(String fromAccount, List<String> groupName) {
        this.fromAccount = fromAccount;
        this.groupName = groupName;
    }

    private GroupDeleteRequest(Builder builder) {
        this.fromAccount = builder.fromAccount;
        this.groupName = builder.groupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public List<String> getGroupName() {
        return groupName;
    }

    public void setGroupName(List<String> groupName) {
        this.groupName = groupName;
    }


    public static final class Builder {
        private String fromAccount;
        private List<String> groupName;

        private Builder() {
        }

        public GroupDeleteRequest build() {
            return new GroupDeleteRequest(this);
        }

        public Builder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public Builder groupName(List<String> groupName) {
            this.groupName = groupName;
            return this;
        }
    }
}
