package com.citicup.controller.dataDisplay;

import com.alibaba.fastjson.JSONObject;
import com.citicup.dao.dataDisplay.*;
import com.citicup.model.dataDisplay.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/majorListedCompanies")
public class MajorListedCompaniesController {

    @Autowired
    private ComparisonOfFinancialRatio_codeNameMapper comparisonOfFinancialRatio_codeNameMapper;
    @Autowired
    private ComparisonOfFinancialRatio_allMapper comparisonOfFinancialRatio_allMapper;

    @RequestMapping("/ComparisonOfFinancialRatio")
    public String ComparisonOfFinancialRatio() {
        List<ComparisonOfFinancialRatio_codeName> codeNames = comparisonOfFinancialRatio_codeNameMapper.getAll();
        List<ComparisonOfFinancialRatio_all> splitTables = comparisonOfFinancialRatio_allMapper.getAll();

        List<String> securcode = new ArrayList<>();
        List<String> securname = new ArrayList<>();
        List<String> roe = new ArrayList<>();
        List<String> roa = new ArrayList<>();
        List<String> grossmargsal = new ArrayList<>();
        List<String> operatpromarg = new ArrayList<>();
        List<String> netsalrat = new ArrayList<>();
        List<String> ebitda = new ArrayList<>();
        List<String> assliablrat = new ArrayList<>();
        List<String> proprigrat = new ArrayList<>();
        List<String> toassturnov = new ArrayList<>();
        List<String> acctrecaivturnovrat = new ArrayList<>();
        List<String> inventturnov = new ArrayList<>();
        List<String> flowrat = new ArrayList<>();
        List<String> spdrat = new ArrayList<>();
        List<String> earnpersh = new ArrayList<>();
        List<String> netassvalpersh = new ArrayList<>();
        List<String> cashflpersh = new ArrayList<>();
        List<String> f19 = new ArrayList<>();

        for (ComparisonOfFinancialRatio_codeName codeName : codeNames){
            securcode.add(codeName.getSecurcode());
            securname.add(codeName.getSecurname());
        }

        for (ComparisonOfFinancialRatio_all splitTable : splitTables){
            roe.add(splitTable.getRoe());
            roa.add(splitTable.getRoa());
            grossmargsal.add(splitTable.getGrossmargsal());
            operatpromarg.add(splitTable.getOperatpromarg());
            netsalrat.add(splitTable.getNetsalrat());
            ebitda.add(splitTable.getEbitda());
            assliablrat.add(splitTable.getAssliablrat());
            proprigrat.add(splitTable.getProprigrat());
            toassturnov.add(splitTable.getToassturnov());
            acctrecaivturnovrat.add(splitTable.getAcctrecaivturnovrat());
            inventturnov.add(splitTable.getInventturnov());
            flowrat.add(splitTable.getFlowrat());
            spdrat.add(splitTable.getSpdrat());
            earnpersh.add(splitTable.getEarnpersh());
            netassvalpersh.add(splitTable.getNetassvalpersh());
            cashflpersh.add(splitTable.getCashflpersh());
            f19.add(splitTable.getF19());
        }

        JSONObject json = new JSONObject();
        json.put("securcode", securcode);
        json.put("securname", securname);
        json.put("roe",roe);
        json.put("roa",roa);
        json.put("grossmargsal",grossmargsal);
        json.put("operatpromarg",operatpromarg);
        json.put("netsalrat",netsalrat);
        json.put("ebitda",ebitda);
        json.put("assliablrat",assliablrat);
        json.put("proprigrat",proprigrat);
        json.put("toassturnov",toassturnov);
        json.put("acctrecaivturnovrat",acctrecaivturnovrat);
        json.put("inventturnov",inventturnov);
        json.put("flowrat",flowrat);
        json.put("spdrat",spdrat);
        json.put("earnpersh",earnpersh);
        json.put("netassvalpersh",netassvalpersh);
        json.put("cashflpersh",cashflpersh);
        json.put("f19",f19);

        return json.toJSONString();
    }

    @Autowired
    private ComparisonOfFinancialData_codeNameMapper comparisonOfFinancialData_codeNameMapper;
    @Autowired
    private ComparisonOfFinancialData_splitTableMapper comparisonOfFinancialData_splitTableMapper;

    @RequestMapping("/ComparisonOfFinancialData")
    public String ComparisonOfFinancialData() {
        List<ComparisonOfFinancialData_codeName> codeNames = comparisonOfFinancialData_codeNameMapper.getAll();
        List<ComparisonOfFinancialData_splitTable> splitTables = comparisonOfFinancialData_splitTableMapper.getAll();

        List<String> securcode = new ArrayList<>();
        List<String> securname = new ArrayList<>();
        List<String> toinc = new ArrayList<>();
        List<String> toincyoygrowrate = new ArrayList<>();
        List<String> netpro = new ArrayList<>();
        List<String> netproyoygrowrate = new ArrayList<>();
        List<String> ebit = new ArrayList<>();
        List<String> ebitda = new ArrayList<>();
        List<String> toasst = new ArrayList<>();
        List<String> toasstyoygrowrate = new ArrayList<>();
        List<String> toliablt = new ArrayList<>();
        List<String> toliabltyoygrowrate = new ArrayList<>();
        List<String> sharehldrigint = new ArrayList<>();
        List<String> sharehldrigintyoygrowrate = new ArrayList<>();
        List<String> netcshflow = new ArrayList<>();
        List<String> netcshfloperact = new ArrayList<>();
        List<String> netcshflinvact = new ArrayList<>();
        List<String> netcshflfinact = new ArrayList<>();

        for (ComparisonOfFinancialData_codeName codeName : codeNames){
            securcode.add(codeName.getSecurcode());
            securname.add(codeName.getSecurname());
        }

        for (ComparisonOfFinancialData_splitTable splitTable : splitTables){
            toinc.add(splitTable.getToinc());
            toincyoygrowrate.add(splitTable.getToincyoygrowrate());
            netpro.add(splitTable.getNetpro());
            netproyoygrowrate.add(splitTable.getNetproyoygrowrate());
            ebit.add(splitTable.getEbit());
            ebitda.add(splitTable.getEbitda());
            toasst.add(splitTable.getToasst());
            toasstyoygrowrate.add(splitTable.getToasstyoygrowrate());
            toliablt.add(splitTable.getToliablt());
            toliabltyoygrowrate.add(splitTable.getToliabltyoygrowrate());
            sharehldrigint.add(splitTable.getSharehldrigint());
            sharehldrigintyoygrowrate.add(splitTable.getSharehldrigintyoygrowrate());
            netcshflow.add(splitTable.getNetcshflow());
            netcshfloperact.add(splitTable.getNetcshfloperact());
            netcshflinvact.add(splitTable.getNetcshflinvact());
            netcshflfinact.add(splitTable.getNetcshflfinact());
        }

        JSONObject json = new JSONObject();
        json.put("securcode", securcode);
        json.put("securname", securname);
        json.put("toinc",toinc);
        json.put("toincyoygrowrate",toincyoygrowrate);
        json.put("netpro",netpro);
        json.put("netproyoygrowrate",netproyoygrowrate);
        json.put("ebit",ebit);
        json.put("ebitda",ebitda);
        json.put("toasst",toasst);
        json.put("toasstyoygrowrate",toasstyoygrowrate);
        json.put("toliablt",toliablt);
        json.put("toliabltyoygrowrate",toliabltyoygrowrate);
        json.put("sharehldrigint",sharehldrigint);
        json.put("sharehldrigintyoygrowrate",sharehldrigintyoygrowrate);
        json.put("netcshflow",netcshflow);
        json.put("netcshfloperact",netcshfloperact);
        json.put("netcshflinvact",netcshflinvact);
        json.put("netcshflfinact",netcshflfinact);

        return json.toJSONString();
    }

    @Autowired
    private ComparisonOfValuationPerformance_codeNameMapper comparisonOfValuationPerformance_codeNameMapper;
    @Autowired
    private ComparisonOfValuationPerformance_otherAttributesMapper comparisonOfValuationPerformance_otherAttributesMapper;
    @Autowired
    private ComparisonOfValuationPerformance_peMapper comparisonOfValuationPerformance_peMapper;

    @RequestMapping("/ComparisonOfValuationPerformance")
    public String ComparisonOfValuationPerformance() {
        List<ComparisonOfValuationPerformance_codeName> a = comparisonOfValuationPerformance_codeNameMapper.getAll();

        List<ComparisonOfValuationPerformance_otherAttributes> b = comparisonOfValuationPerformance_otherAttributesMapper.getAll();

        List<ComparisonOfValuationPerformance_pe> c = comparisonOfValuationPerformance_peMapper.getAll();


        List<String> securcode = new ArrayList<>();
        List<String> securname = new ArrayList<>();
        List<String> latstclosday = new ArrayList<>();
        List<String> tomaktval = new ArrayList<>();
        List<String> marktvalofcircul = new ArrayList<>();
        List<String> pbmrq = new ArrayList<>();
        List<String> pcfttm = new ArrayList<>();
        List<String> psttm = new ArrayList<>();
        List<String> entpmarktval = new ArrayList<>();
        List<String> emvincrat = new ArrayList<>();
        List<String> emvebitdarat = new ArrayList<>();
        List<String> pettm = new ArrayList<>();

        for (ComparisonOfValuationPerformance_codeName codeName : a){
            securcode.add(codeName.getSecurcode());
            securname.add(codeName.getSecurname());
        }
        for (ComparisonOfValuationPerformance_otherAttributes codeName : b){
            securcode.add(codeName.getSecurcode());
            latstclosday.add(codeName.getLatstclosday());
            tomaktval.add(codeName.getTomaktval());
            marktvalofcircul.add(codeName.getMarktvalofcircul());
            pbmrq.add(codeName.getPbmrq());
            pcfttm.add(codeName.getPcfttm());
            psttm.add(codeName.getPsttm());
            entpmarktval.add(codeName.getEntpmarktval());
            emvincrat.add(codeName.getEmvincrat());
            emvebitdarat.add(codeName.getEmvebitdarat());
        }
        for (ComparisonOfValuationPerformance_pe codeName : c){
            pettm.add(codeName.getPettm());
        }
        JSONObject json = new JSONObject();

        json.put("securcode",securcode);
        json.put("securname",securname);
        json.put("latstclosday",latstclosday);
        json.put("tomaktval",tomaktval);
        json.put("marktvalofcircul",marktvalofcircul);
        json.put("pbmrq",pbmrq);
        json.put("pcfttm",pcfttm);
        json.put("psttm",psttm);
        json.put("entpmarktval",entpmarktval);
        json.put("emvincrat",emvincrat);
        json.put("emvebitdarat",emvebitdarat);
        json.put("pettm",pettm);

        return json.toJSONString();
    }

    @Autowired
    private ContrastOfMarketPerformance_allMapper contrastOfMarketPerformance_allMapper;
    @Autowired
    private ContrastOfMarketPerformance_shanghaiAndShenzhenASharesMapper contrastOfMarketPerformance_shanghaiAndShenzhenASharesMapper;
    @Autowired
    private ContrastOfMarketPerformance_newThirdBoardMapper contrastOfMarketPerformance_newThirdBoardMapper;
    @Autowired
    private ComparisonOfMarketPerformance_codeNameMapper comparisonOfMarketPerformance_codeNameMapper;
    @Autowired
    private ComparisonOfMarketPerformance_risefalMapper comparisonOfMarketPerformance_risefalMapper;
    @Autowired
    private ComparisonOfMarketPerformance_sheet2Mapper comparisonOfMarketPerformance_sheet2Mapper;

    @RequestMapping("/ContrastOfMarketPerformance")
    public String ContrastOfMarketPerformance() {
        List<ContrastOfMarketPerformance_all> a = contrastOfMarketPerformance_allMapper.getAll();

        List<ContrastOfMarketPerformance_shanghaiAndShenzhenAShares> b = contrastOfMarketPerformance_shanghaiAndShenzhenASharesMapper.getAll();

        List<ContrastOfMarketPerformance_newThirdBoard> c = contrastOfMarketPerformance_newThirdBoardMapper.getAll();

        List<ComparisonOfMarketPerformance_codeName> d = comparisonOfMarketPerformance_codeNameMapper.getAll();

        List<ComparisonOfMarketPerformance_risefal> e = comparisonOfMarketPerformance_risefalMapper.getAll();

        List<ComparisonOfMarketPerformance_sheet2> f = comparisonOfMarketPerformance_sheet2Mapper.getAll();


        List<String> indstnam = new ArrayList<>();
        List<String> nearawkrisefal = new ArrayList<>();
        List<String> nearamthrisefal = new ArrayList<>();
        List<String> nearthrmthrisefal = new ArrayList<>();
        List<String> ydtrisefal = new ArrayList<>();
        List<String> nearayearrisefal = new ArrayList<>();
        List<String> indstnam2 = new ArrayList<>();
        List<String> nearawkrisefal2 = new ArrayList<>();
        List<String> nearamthrisefal2 = new ArrayList<>();
        List<String> nearthrmthrisefal2 = new ArrayList<>();
        List<String> ydtrisefal2 = new ArrayList<>();
        List<String> nearayearrisefal2 = new ArrayList<>();
        List<String> indstnam3 = new ArrayList<>();
        List<String> nearawkrisefal3 = new ArrayList<>();
        List<String> nearamthrisefal3 = new ArrayList<>();
        List<String> nearthrmthrisefal3 = new ArrayList<>();
        List<String> ydtrisefal3 = new ArrayList<>();
        List<String> nearayearrisefal3 = new ArrayList<>();
        List<String> securcode = new ArrayList<>();
        List<String> securname = new ArrayList<>();
        List<String> securcode2 = new ArrayList<>();
        List<String> fucknew = new ArrayList<>();
        List<String> thwk = new ArrayList<>();
        List<String> thmth = new ArrayList<>();
        List<String> thyear = new ArrayList<>();
        List<String> nearamth = new ArrayList<>();
        List<String> nearthrmth = new ArrayList<>();
        List<String> nearsixmth = new ArrayList<>();
        List<String> nearayear = new ArrayList<>();
        List<String> securcode3 = new ArrayList<>();
        List<String> latstclosday = new ArrayList<>();
        List<String> latstclosprice = new ArrayList<>();
        List<String> highstinfiftwowk = new ArrayList<>();
        List<String> lowstinfiftwowk = new ArrayList<>();
        List<String> hifwprepricrat = new ArrayList<>();
        List<String> prepriclifwrat = new ArrayList<>();
        List<String> namthdailyaveturnov = new ArrayList<>();
        List<String> namthdailyexchrat = new ArrayList<>();

        for (ContrastOfMarketPerformance_all t : a){
            indstnam.add(t.getIndstnam());
            nearawkrisefal.add(t.getNearawkrisefal());
            nearamthrisefal.add(t.getNearamthrisefal());
            nearthrmthrisefal.add(t.getNearthrmthrisefal());
            ydtrisefal.add(t.getYdtrisefal());
            nearayearrisefal.add(t.getNearayearrisefal());
        }
        for (ContrastOfMarketPerformance_shanghaiAndShenzhenAShares t : b){
            indstnam2.add(t.getIndstnam());
            nearawkrisefal2.add(t.getNearawkrisefal());
            nearamthrisefal2.add(t.getNearamthrisefal());
            nearthrmthrisefal2.add(t.getNearthrmthrisefal());
            ydtrisefal2.add(t.getYdtrisefal());
            nearayearrisefal2.add(t.getNearayearrisefal());
        }
        for (ContrastOfMarketPerformance_newThirdBoard t : c){
            indstnam3.add(t.getIndstnam());
            nearawkrisefal3.add(t.getNearawkrisefal());
            nearamthrisefal3.add(t.getNearamthrisefal());
            nearthrmthrisefal3.add(t.getNearthrmthrisefal());
            ydtrisefal3.add(t.getYdtrisefal());
            nearayearrisefal3.add(t.getNearayearrisefal());
        }
        for (ComparisonOfMarketPerformance_codeName t : d){
            securcode.add(t.getSecurcode());
            securname.add(t.getSecurname());
        }
        for (ComparisonOfMarketPerformance_risefal t : e){
            securcode2.add(t.getSecurcode());
            fucknew.add(t.getFucknew());
            thwk.add(t.getThwk());
            thmth.add(t.getThmth());
            thyear.add(t.getThyear());
            nearamth.add(t.getNearamth());
            nearthrmth.add(t.getNearthrmth());
            nearsixmth.add(t.getNearsixmth());
            nearayear.add(t.getNearayear());
        }
        for (ComparisonOfMarketPerformance_sheet2 t : f){
            securcode3.add(t.getSecurcode());
            latstclosday.add(t.getLatstclosday());
            latstclosprice.add(t.getLatstclosprice());
            highstinfiftwowk.add(t.getHighstinfiftwowk());
            lowstinfiftwowk.add(t.getLowstinfiftwowk());
            hifwprepricrat.add(t.getHifwprepricrat());
            prepriclifwrat.add(t.getPrepriclifwrat());
            namthdailyaveturnov.add(t.getNamthdailyaveturnov());
            namthdailyexchrat.add(t.getNamthdailyexchrat());
        }
        JSONObject json = new JSONObject();

        json.put("indstnam",indstnam);
        json.put("nearawkrisefal",nearawkrisefal);
        json.put("nearamthrisefal",nearamthrisefal);
        json.put("nearthrmthrisefal",nearthrmthrisefal);
        json.put("ydtrisefal",ydtrisefal);
        json.put("nearayearrisefal",nearayearrisefal);
        json.put("indstnam2",indstnam2);
        json.put("nearawkrisefal2",nearawkrisefal2);
        json.put("nearamthrisefal2",nearamthrisefal2);
        json.put("nearthrmthrisefal2",nearthrmthrisefal2);
        json.put("ydtrisefal2",ydtrisefal2);
        json.put("nearayearrisefal2",nearayearrisefal2);
        json.put("indstnam3",indstnam3);
        json.put("nearawkrisefal3",nearawkrisefal3);
        json.put("nearamthrisefal3",nearamthrisefal3);
        json.put("nearthrmthrisefal3",nearthrmthrisefal3);
        json.put("ydtrisefal3",ydtrisefal3);
        json.put("nearayearrisefal3",nearayearrisefal3);
        json.put("securcode",securcode);
        json.put("securname",securname);
        json.put("securcode2",securcode2);
        json.put("fucknew",fucknew);
        json.put("thwk",thwk);
        json.put("thmth",thmth);
        json.put("thyear",thyear);
        json.put("nearamth",nearamth);
        json.put("nearthrmth",nearthrmth);
        json.put("nearsixmth",nearsixmth);
        json.put("nearayear",nearayear);
        json.put("securcode3",securcode3);
        json.put("latstclosday",latstclosday);
        json.put("latstclosprice",latstclosprice);
        json.put("highstinfiftwowk",highstinfiftwowk);
        json.put("lowstinfiftwowk",lowstinfiftwowk);
        json.put("hifwprepricrat",hifwprepricrat);
        json.put("prepriclifwrat",prepriclifwrat);
        json.put("namthdailyaveturnov",namthdailyaveturnov);
        json.put("namthdailyexchrat",namthdailyexchrat);
        return json.toJSONString();
    }

    @Autowired
    private ComparisonOfEarningsForecast_codeSplitTableMapper comparisonOfEarningsForecast_codeSplitTableMapper;
    @Autowired
    private ComparisonOfEarningsForecast_codeNameMapper comparisonOfEarningsForecast_codeNameMapper;
    @Autowired
    private ComparisonOfEarningsForecast_sheet1Mapper comparisonOfEarningsForecast_sheet1Mapper;

    @RequestMapping("/ComparisonOfEarningsForecast")
    public String ComparisonOfEarningsForecast() {
        List<ComparisonOfEarningsForecast_codeSplitTable> a = comparisonOfEarningsForecast_codeSplitTableMapper.getAll();

        List<ComparisonOfEarningsForecast_codeName> b = comparisonOfEarningsForecast_codeNameMapper.getAll();

        List<ComparisonOfEarningsForecast_sheet1> c = comparisonOfEarningsForecast_sheet1Mapper.getAll();


        List<String> earnpershare = new ArrayList<>();
        List<String> toinc = new ArrayList<>();
        List<String> toincyoygrowrate = new ArrayList<>();
        List<String> netpro = new ArrayList<>();
        List<String> netproyoygrowrate = new ArrayList<>();
        List<String> pettm = new ArrayList<>();
        List<String> premechnum = new ArrayList<>();
        List<String> securcode = new ArrayList<>();
        List<String> securname = new ArrayList<>();
        List<String> securcode1 = new ArrayList<>();
        List<String> latstclosday = new ArrayList<>();
        List<String> latstclosprice = new ArrayList<>();
        List<String> unanmsevalu = new ArrayList<>();

        for (ComparisonOfEarningsForecast_codeSplitTable t : a){
            earnpershare.add(t.getEarnpershare());
            toinc.add(t.getToinc());
            toincyoygrowrate.add(t.getToincyoygrowrate());
            netpro.add(t.getNetpro());
            netproyoygrowrate.add(t.getNetproyoygrowrate());
            pettm.add(t.getPettm());
            premechnum.add(t.getPremechnum());
        }
        for (ComparisonOfEarningsForecast_codeName t : b){
            securcode.add(t.getSecurcode());
            securname.add(t.getSecurname());
        }
        for (ComparisonOfEarningsForecast_sheet1 t : c){
            securcode1.add(t.getSecurcode());
            latstclosday.add(t.getLatstclosday());
            latstclosprice.add(t.getLatstclosprice());
            unanmsevalu.add(t.getUnanmsevalu());
        }
        JSONObject json = new JSONObject();

        json.put("earnpershare",earnpershare);
        json.put("toinc",toinc);
        json.put("toincyoygrowrate",toincyoygrowrate);
        json.put("netpro",netpro);
        json.put("netproyoygrowrate",netproyoygrowrate);
        json.put("pettm",pettm);
        json.put("premechnum",premechnum);
        json.put("securcode",securcode);
        json.put("securname",securname);
        json.put("securcode1",securcode1);
        json.put("latstclosday",latstclosday);
        json.put("latstclosprice",latstclosprice);
        json.put("unanmsevalu",unanmsevalu);
        return json.toJSONString();
    }


}
