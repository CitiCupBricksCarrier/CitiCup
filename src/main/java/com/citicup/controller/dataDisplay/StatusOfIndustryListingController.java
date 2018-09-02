package com.citicup.controller.dataDisplay;

import com.alibaba.fastjson.JSONObject;
import com.citicup.dao.dataDisplay.*;
import com.citicup.model.dataDisplay.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/StatusOfIndustryListing")
public class StatusOfIndustryListingController {

    @Autowired
    private StatusOfIndustryListing_allMapper statusOfIndustryListing_allMapper;
    @Autowired
    private StatusOfIndustryListing_newThirdBoardMapper statusOfIndustryListing_newThirdBoardMapper;
    @Autowired
    private StatusOfIndustryListing_shanghaiAndShenzhenASharesMapper statusOfIndustryListing_shanghaiAndShenzhenASharesMapper;

    @RequestMapping("/StatusOfIndustryListing_all")
    public String selectStatusOfIndustryListing_all() {
        List<StatusOfIndustryListing_all> list = statusOfIndustryListing_allMapper.getAll();
        List<JSONObject> json = new ArrayList<>();

        List<String> indstnam = new ArrayList<>();
        List<String> pettm = new ArrayList<>();
        List<String> peyearfcast = new ArrayList<>();
        List<String> pblf = new ArrayList<>();
        List<String> psttm = new ArrayList<>();
        List<String> roettm = new ArrayList<>();
        List<String> roattm = new ArrayList<>();
        List<String> netpro = new ArrayList<>();
        List<String> revenpro = new ArrayList<>();
        List<String> tomaktval = new ArrayList<>();
        List<String> businsinc = new ArrayList<>();
        List<String> toassets = new ArrayList<>();

        for(StatusOfIndustryListing_all sil : list) {
            indstnam.add(sil.getIndstnam());
            pettm.add(sil.getPettm());
            peyearfcast.add(sil.getPeyearfcast());
            pblf.add(sil.getPblf());
            psttm.add(sil.getPsttm());
            roettm.add(sil.getRoettm());
            roattm.add(sil.getRoattm());
            netpro.add(sil.getNetpro());
            revenpro.add(sil.getRevenpro());
            tomaktval.add(sil.getTomaktval());
            businsinc.add(sil.getBusinsinc());
            toassets.add(sil.getToassets());
        }

        JSONObject indstnamJson = new JSONObject();
        indstnamJson.put("indstnam", indstnam);
        JSONObject pettmJson = new JSONObject();
        pettmJson.put("pettm", pettm);
        JSONObject peyearfcastJson = new JSONObject();
        peyearfcastJson.put("peyearfcast", peyearfcast);
        JSONObject pblfJson = new JSONObject();
        pblfJson.put("pblf", pblf);
        JSONObject psttmJson = new JSONObject();
        psttmJson.put("psttm", psttm);
        JSONObject roettmJson = new JSONObject();
        psttmJson.put("roettm", roettm);
        JSONObject roattmJson = new JSONObject();
        roattmJson.put("roattm", roattm);
        JSONObject netproJson = new JSONObject();
        netproJson.put("netpro", netpro);
        JSONObject revenproJson = new JSONObject();
        revenproJson.put("revenpro", revenpro);
        JSONObject tomaktvalJson = new JSONObject();
        tomaktvalJson.put("tomaktval", tomaktval);
        JSONObject businsincJson = new JSONObject();
        businsincJson.put("businsinc", businsinc);
        JSONObject toassetsJson = new JSONObject();
        toassetsJson.put("toassets", toassets);

        json.add(indstnamJson);
        json.add(pettmJson);
        json.add(peyearfcastJson);
        json.add(pblfJson);
        json.add(psttmJson);
        json.add(roettmJson);
        json.add(roattmJson);
        json.add(netproJson);
        json.add(revenproJson);
        json.add(tomaktvalJson);
        json.add(businsincJson);
        json.add(toassetsJson);

        return JSONObject.toJSONString(json);
    }

    @RequestMapping("/StatusOfIndustryListing_newThirdBoard")
    public String selectStatusOfIndustryListing_newThirdBoard() {
        List<StatusOfIndustryListing_newThirdBoard> list = statusOfIndustryListing_newThirdBoardMapper.getAll();
        List<JSONObject> json = new ArrayList<>();

        List<String> indstnam = new ArrayList<>();
        List<String> pettm = new ArrayList<>();
        List<String> peyearfcast = new ArrayList<>();
        List<String> pblf = new ArrayList<>();
        List<String> psttm = new ArrayList<>();
        List<String> roettm = new ArrayList<>();
        List<String> roattm = new ArrayList<>();
        List<String> netpro = new ArrayList<>();
        List<String> revenpro = new ArrayList<>();
        List<String> tomaktval = new ArrayList<>();
        List<String> businsinc = new ArrayList<>();
        List<String> toassets = new ArrayList<>();

        for(StatusOfIndustryListing_newThirdBoard sil : list) {
            indstnam.add(sil.getIndstnam());
            pettm.add(sil.getPettm());
            peyearfcast.add(sil.getPeyearfcast());
            pblf.add(sil.getPblf());
            psttm.add(sil.getPsttm());
            roettm.add(sil.getRoettm());
            roattm.add(sil.getRoattm());
            netpro.add(sil.getNetpro());
            revenpro.add(sil.getRevenpro());
            tomaktval.add(sil.getTomaktval());
            businsinc.add(sil.getBusinsinc());
            toassets.add(sil.getToassets());
        }

        JSONObject indstnamJson = new JSONObject();
        indstnamJson.put("indstnam", indstnam);
        JSONObject pettmJson = new JSONObject();
        pettmJson.put("pettm", pettm);
        JSONObject peyearfcastJson = new JSONObject();
        peyearfcastJson.put("peyearfcast", peyearfcast);
        JSONObject pblfJson = new JSONObject();
        pblfJson.put("pblf", pblf);
        JSONObject psttmJson = new JSONObject();
        psttmJson.put("psttm", psttm);
        JSONObject roettmJson = new JSONObject();
        psttmJson.put("roettm", roettm);
        JSONObject roattmJson = new JSONObject();
        roattmJson.put("roattm", roattm);
        JSONObject netproJson = new JSONObject();
        netproJson.put("netpro", netpro);
        JSONObject revenproJson = new JSONObject();
        revenproJson.put("revenpro", revenpro);
        JSONObject tomaktvalJson = new JSONObject();
        tomaktvalJson.put("tomaktval", tomaktval);
        JSONObject businsincJson = new JSONObject();
        businsincJson.put("businsinc", businsinc);
        JSONObject toassetsJson = new JSONObject();
        toassetsJson.put("toassets", toassets);

        json.add(indstnamJson);
        json.add(pettmJson);
        json.add(peyearfcastJson);
        json.add(pblfJson);
        json.add(psttmJson);
        json.add(roettmJson);
        json.add(roattmJson);
        json.add(netproJson);
        json.add(revenproJson);
        json.add(tomaktvalJson);
        json.add(businsincJson);
        json.add(toassetsJson);

        return JSONObject.toJSONString(json);
    }

    @RequestMapping("/StatusOfIndustryListing_shanghaiAndShenzhenAShares")
    public String selectStatusOfIndustryListing_shanghaiAndShenzhenAShares() {
        List<StatusOfIndustryListing_shanghaiAndShenzhenAShares> list = statusOfIndustryListing_shanghaiAndShenzhenASharesMapper.getAll();
        List<JSONObject> json = new ArrayList<>();

        List<String> indstnam = new ArrayList<>();
        List<String> pettm = new ArrayList<>();
        List<String> peyearfcast = new ArrayList<>();
        List<String> pblf = new ArrayList<>();
        List<String> psttm = new ArrayList<>();
        List<String> roettm = new ArrayList<>();
        List<String> roattm = new ArrayList<>();
        List<String> netpro = new ArrayList<>();
        List<String> revenpro = new ArrayList<>();
        List<String> tomaktval = new ArrayList<>();
        List<String> businsinc = new ArrayList<>();
        List<String> toassets = new ArrayList<>();

        for(StatusOfIndustryListing_shanghaiAndShenzhenAShares sil : list) {
            indstnam.add(sil.getIndstnam());
            pettm.add(sil.getPettm());
            peyearfcast.add(sil.getPeyearfcast());
            pblf.add(sil.getPblf());
            psttm.add(sil.getPsttm());
            roettm.add(sil.getRoettm());
            roattm.add(sil.getRoattm());
            netpro.add(sil.getNetpro());
            revenpro.add(sil.getRevenpro());
            tomaktval.add(sil.getTomaktval());
            businsinc.add(sil.getBusinsinc());
            toassets.add(sil.getToassets());
        }

        JSONObject indstnamJson = new JSONObject();
        indstnamJson.put("indstnam", indstnam);
        JSONObject pettmJson = new JSONObject();
        pettmJson.put("pettm", pettm);
        JSONObject peyearfcastJson = new JSONObject();
        peyearfcastJson.put("peyearfcast", peyearfcast);
        JSONObject pblfJson = new JSONObject();
        pblfJson.put("pblf", pblf);
        JSONObject psttmJson = new JSONObject();
        psttmJson.put("psttm", psttm);
        JSONObject roettmJson = new JSONObject();
        psttmJson.put("roettm", roettm);
        JSONObject roattmJson = new JSONObject();
        roattmJson.put("roattm", roattm);
        JSONObject netproJson = new JSONObject();
        netproJson.put("netpro", netpro);
        JSONObject revenproJson = new JSONObject();
        revenproJson.put("revenpro", revenpro);
        JSONObject tomaktvalJson = new JSONObject();
        tomaktvalJson.put("tomaktval", tomaktval);
        JSONObject businsincJson = new JSONObject();
        businsincJson.put("businsinc", businsinc);
        JSONObject toassetsJson = new JSONObject();
        toassetsJson.put("toassets", toassets);

        json.add(indstnamJson);
        json.add(pettmJson);
        json.add(peyearfcastJson);
        json.add(pblfJson);
        json.add(psttmJson);
        json.add(roettmJson);
        json.add(roattmJson);
        json.add(netproJson);
        json.add(revenproJson);
        json.add(tomaktvalJson);
        json.add(businsincJson);
        json.add(toassetsJson);

        return JSONObject.toJSONString(json);
    }

}
