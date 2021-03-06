package org.msdg.recoder.service;

import org.msdg.recoder.dao.RecoderTagDao;
import org.msdg.recoder.model.RecoderTag;
import org.msdg.recoder.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2015/9/22.
 */
@Service
public class RecoderTagService {

    @Autowired
    private RecoderTagDao recoderTagDao;

    public List<RecoderTag> allTags(int creator) {
        return recoderTagDao.getAllRecoderTag(creator);
    }

    public RecoderTag add(RecoderTag recoderTag, User user) {
        recoderTag.setCreator(user.getId());
        recoderTagDao.addRecoderTag(recoderTag);
        return recoderTag;
    }
}
