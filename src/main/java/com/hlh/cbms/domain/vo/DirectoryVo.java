package com.hlh.cbms.domain.vo;

import com.hlh.cbms.domain.entity.Directory;
import com.hlh.cbms.domain.entity.RecentNews;
import lombok.Data;

import java.util.ArrayList;

@Data
public class DirectoryVo extends Directory {
    ArrayList<RecentNews> recentNews;
}
