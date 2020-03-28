/*
 * Copyright 2019-2029 geekidea(https://github.com/geekidea)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.foobar.entity;

import io.geekidea.springbootplus.framework.common.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.baomidou.mybatisplus.annotation.TableField;

/**
 * <pre>
 * FooBar
 * </pre>
 *
 * @author geekidea
 * @since 2020-03-23
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "FooBar对象", description = "FooBar")
public class FooBar extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("Name")
    @NotBlank(message = "Name不能为空")
    private String name;

    @ApiModelProperty("Foo")
    private String foo;

    @ApiModelProperty("Bar")
    @NotBlank(message = "Bar不能为空")
    private String bar;

    @ApiModelProperty("Remark")
    private String remark;

    @ApiModelProperty("State，0：Disable，1：Enable")
    private Integer state;

    @ApiModelProperty("Version")
    private Integer version;

    @ApiModelProperty("Create Time")
    private Date createTime;

    @ApiModelProperty("Update Time")
    private Date updateTime;

}
