/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2019-2020. All rights reserved.
 * Generated by the CloudDB ObjectType compiler.  DO NOT EDIT!
 */
package com.teammoviealley.moviealleyapp.model;

import com.huawei.agconnect.cloud.database.CloudDBZoneObject;
import com.huawei.agconnect.cloud.database.Text;
import com.huawei.agconnect.cloud.database.annotations.DefaultValue;
import com.huawei.agconnect.cloud.database.annotations.EntireEncrypted;
import com.huawei.agconnect.cloud.database.annotations.NotNull;
import com.huawei.agconnect.cloud.database.annotations.Indexes;
import com.huawei.agconnect.cloud.database.annotations.PrimaryKeys;

import java.util.Date;

/**
 * Definition of ObjectType StoreFavoriteMovie.
 *
 * @since 2022-02-01
 */
@PrimaryKeys({"email"})
@Indexes({"email:email"})
public final class StoreFavoriteMovie extends CloudDBZoneObject {
    private String email;

    private String movielist;

    public StoreFavoriteMovie() {
        super(StoreFavoriteMovie.class);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setMovielist(String movielist) {
        this.movielist = movielist;
    }

    public String getMovielist() {
        return movielist;
    }

}
