package com.example.demo.bean.stacker;

import com.example.demo.util.TcpUtil;

public class StackerBean {

    private StringBuffer  reg;
    private StringBuffer  cpr;
    private StringBuffer  tse;
    private StringBuffer  crx;
    private StringBuffer  ctl;
    private StringBuffer  ctc;
    private StringBuffer  cpu;
    private StringBuffer  cta;
    private StringBuffer  cpd;
    private StringBuffer  coc;
    private StringBuffer  rta;
    private StringBuffer  scr;
    private StringBuffer  rpd;
    private StringBuffer  pis;
    private StringBuffer  tmi;


    public StringBuffer getReg() {
        reg=new StringBuffer();
        reg.append("{");
        //确认位
        reg.append("1");
        //序号位
        reg.append("2222");
        reg.append("JD3601");
        reg.append("WCS001");
        reg.append("REG");
        //uuid
        reg.append(TcpUtil.getUid());
        reg.append("}");
        return reg;
    }

    public void setReg(StringBuffer reg) {
        this.reg = reg;
    }

    public StringBuffer getCpr() {
        cpr=new StringBuffer();
        cpr.append("{");
        //确认位
        cpr.append("1");
        //序号位
        cpr.append("2222");
        cpr.append("JD3601");
        cpr.append("WCS001");
        cpr.append("cpr");
        //uuid
        cpr.append(TcpUtil.getUid());
        cpr.append("}");
        return cpr;
    }

    public void setCpr(StringBuffer cpr) {
        this.cpr = cpr;
    }

    public StringBuffer getTse() {
        tse=new StringBuffer();
        tse.append("{");
        //确认位
        tse.append("1");
        //序号位
        tse.append("2222");
        tse.append("JD3601");
        tse.append("WCS001");
        tse.append("TSE");
        //uuid
        tse.append(TcpUtil.getUid());
        tse.append("containerNo");
        tse.append("stackerNo");
        tse.append("}");
        return tse;
    }

    public void setTse(StringBuffer tse) {
        this.tse = tse;
    }

    public StringBuffer getCrx() {
        crx=new StringBuffer();
        crx.append("{");
        //确认位
        crx.append("1");
        //序号位
        crx.append("2222");
        crx.append("JD3601");
        crx.append("WCS001");
        crx.append("crx");
        //uuid
        crx.append(TcpUtil.getUid());
        crx.append("}");
        return crx;
    }

    public void setCrx(StringBuffer crx) {
        this.crx = crx;
    }

    public StringBuffer getCtl() {
        ctl=new StringBuffer();
        ctl.append("{");
        //确认位
        ctl.append("1");
        //序号位
        ctl.append("2222");
        ctl.append("JD3601");
        ctl.append("WCS001");
        ctl.append("ctl");
        //uuid
        ctl.append(TcpUtil.getUid());
        ctl.append("}");
        return ctl;
    }

    public void setCtl(StringBuffer ctl) {
        this.ctl = ctl;
    }

    public StringBuffer getCtc() {
        ctc=new StringBuffer();
        ctc.append("{");
        //确认位
        ctc.append("1");
        //序号位
        ctc.append("2222");
        ctc.append("JD3601");
        ctc.append("WCS001");
        ctc.append("ctc");
        //uuid
        ctc.append(TcpUtil.getUid());
        ctc.append("}");
        return ctc;
    }

    public void setCtc(StringBuffer ctc) {
        this.ctc = ctc;
    }

    public StringBuffer getCpu() {
        cpu=new StringBuffer();
        cpu.append("{");
        //确认位
        cpu.append("1");
        //序号位
        cpu.append("2222");
        cpu.append("JD3601");
        cpu.append("WCS001");
        cpu.append("cpu");
        //uuid
        cpu.append(TcpUtil.getUid());
        cpu.append("}");
        return cpu;
    }

    public void setCpu(StringBuffer cpu) {
        this.cpu = cpu;
    }

    public StringBuffer getCta() {
        cta=new StringBuffer();
        cta.append("{");
        //确认位
        cta.append("1");
        //序号位
        cta.append("2222");
        cta.append("JD3601");
        cta.append("WCS001");
        cta.append("cta");
        //uuid
        cta.append(TcpUtil.getUid());
        cta.append("}");
        return cta;
    }

    public void setCta(StringBuffer cta) {
        this.cta = cta;
    }

    public StringBuffer getCpd() {

        cpd=new StringBuffer();
        cpd.append("{");
        //确认位
        cpd.append("1");
        //序号位
        cpd.append("2222");
        cpd.append("JD3601");
        cpd.append("WCS001");
        cpd.append("cpd");
        //uuid
        cpd.append(TcpUtil.getUid());
        cpd.append("}");
        return cpd;
    }

    public void setCpd(StringBuffer cpd) {
        this.cpd = cpd;
    }

    public StringBuffer getCoc() {
        coc=new StringBuffer();
        coc.append("{");
        //确认位
        coc.append("1");
        //序号位
        coc.append("2222");
        coc.append("JD3601");
        coc.append("WCS001");
        coc.append("coc");
        //uuid
        coc.append(TcpUtil.getUid());
        coc.append("}");
        return coc;
    }

    public void setCoc(StringBuffer coc) {
        this.coc = coc;
    }

    public StringBuffer getRta() {

        rta=new StringBuffer();
        rta.append("{");
        //确认位
        rta.append("1");
        //序号位
        rta.append("2222");
        rta.append("JD3601");
        rta.append("WCS001");
        rta.append("rta");
        //uuid
        rta.append(TcpUtil.getUid());
        rta.append("}");
        return rta;
    }

    public void setRta(StringBuffer rta) {
        this.rta = rta;
    }

    public StringBuffer getScr() {

        scr=new StringBuffer();
        scr.append("{");
        //确认位
        scr.append("1");
        //序号位
        scr.append("2222");
        scr.append("JD3601");
        scr.append("WCS001");
        scr.append("scr");
        //uuid
        scr.append(TcpUtil.getUid());
        scr.append("}");
        return scr;
    }

    public void setScr(StringBuffer scr) {
        this.scr = scr;
    }

    public StringBuffer getRpd() {
        rpd=new StringBuffer();
        rpd.append("{");
        //确认位
        rpd.append("1");
        //序号位
        rpd.append("2222");
        rpd.append("JD3601");
        rpd.append("WCS001");
        rpd.append("rpd");
        //uuid
        rpd.append(TcpUtil.getUid());
        rpd.append("}");
        return rpd;
    }

    public void setRpd(StringBuffer rpd) {
        this.rpd = rpd;
    }

    public StringBuffer getPis() {
        pis=new StringBuffer();
        pis.append("{");
        //确认位
        pis.append("1");
        //序号位
        pis.append("2222");
        pis.append("JD3601");
        pis.append("WCS001");
        pis.append("pis");
        //uuid
        pis.append(TcpUtil.getUid());
        pis.append("}");
        return pis;
    }

    public void setPis(StringBuffer pis) {
        this.pis = pis;
    }

    public StringBuffer getTmi() {
        tmi=new StringBuffer();
        tmi.append("{");
        //确认位
        tmi.append("1");
        //序号位
        tmi.append("2222");
        tmi.append("JD3601");
        tmi.append("WCS001");
        tmi.append("tmi");
        //uuid
        tmi.append(TcpUtil.getUid());
        tmi.append("}");
        return tmi;
    }

    public void setTmi(StringBuffer tmi) {
        this.tmi = tmi;
    }
}
