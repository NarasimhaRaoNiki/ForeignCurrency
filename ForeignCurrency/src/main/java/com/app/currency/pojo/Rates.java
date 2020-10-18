
package com.app.currency.pojo;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "GBP",
    "HKD",
    "SEK",
    "SKK",
    "DKK",
    "LVL",
    "ROL",
    "CHF",
    "CZK",
    "SGD",
    "SIT",
    "NOK",
    "PLN",
    "LTL",
    "CYP",
    "ZAR",
    "CAD",
    "ISK",
    "USD",
    "EEK",
    "MTL",
    "NZD",
    "JPY",
    "TRL",
    "KRW",
    "HUF",
    "AUD"
})
public class Rates {

    @JsonProperty("GBP")
    private Double gBP;
    @JsonProperty("HKD")
    private Double hKD;
    @JsonProperty("SEK")
    private Double sEK;
    @JsonProperty("SKK")
    private Double sKK;
    @JsonProperty("DKK")
    private Double dKK;
    @JsonProperty("LVL")
    private Double lVL;
    @JsonProperty("ROL")
    private Double rOL;
    @JsonProperty("CHF")
    private Double cHF;
    @JsonProperty("CZK")
    private Double cZK;
    @JsonProperty("SGD")
    private Double sGD;
    @JsonProperty("SIT")
    private Double sIT;
    @JsonProperty("NOK")
    private Double nOK;
    @JsonProperty("PLN")
    private Double pLN;
    @JsonProperty("LTL")
    private Double lTL;
    @JsonProperty("CYP")
    private Double cYP;
    @JsonProperty("ZAR")
    private Double zAR;
    @JsonProperty("CAD")
    private Double cAD;
    @JsonProperty("ISK")
    private Double iSK;
    @JsonProperty("USD")
    private Double uSD;
    @JsonProperty("EEK")
    private Double eEK;
    @JsonProperty("MTL")
    private Double mTL;
    @JsonProperty("NZD")
    private Double nZD;
    @JsonProperty("JPY")
    private Double jPY;
    @JsonProperty("TRL")
    private Double tRL;
    @JsonProperty("KRW")
    private Double kRW;
    @JsonProperty("HUF")
    private Double hUF;
    @JsonProperty("AUD")
    private Double aUD;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("GBP")
    public Double getGBP() {
        return gBP;
    }

    @JsonProperty("GBP")
    public void setGBP(Double gBP) {
        this.gBP = gBP;
    }

    @JsonProperty("HKD")
    public Double getHKD() {
        return hKD;
    }

    @JsonProperty("HKD")
    public void setHKD(Double hKD) {
        this.hKD = hKD;
    }

    @JsonProperty("SEK")
    public Double getSEK() {
        return sEK;
    }

    @JsonProperty("SEK")
    public void setSEK(Double sEK) {
        this.sEK = sEK;
    }

    @JsonProperty("SKK")
    public Double getSKK() {
        return sKK;
    }

    @JsonProperty("SKK")
    public void setSKK(Double sKK) {
        this.sKK = sKK;
    }

    @JsonProperty("DKK")
    public Double getDKK() {
        return dKK;
    }

    @JsonProperty("DKK")
    public void setDKK(Double dKK) {
        this.dKK = dKK;
    }

    @JsonProperty("LVL")
    public Double getLVL() {
        return lVL;
    }

    @JsonProperty("LVL")
    public void setLVL(Double lVL) {
        this.lVL = lVL;
    }

    @JsonProperty("ROL")
    public Double getROL() {
        return rOL;
    }

    @JsonProperty("ROL")
    public void setROL(Double rOL) {
        this.rOL = rOL;
    }

    @JsonProperty("CHF")
    public Double getCHF() {
        return cHF;
    }

    @JsonProperty("CHF")
    public void setCHF(Double cHF) {
        this.cHF = cHF;
    }

    @JsonProperty("CZK")
    public Double getCZK() {
        return cZK;
    }

    @JsonProperty("CZK")
    public void setCZK(Double cZK) {
        this.cZK = cZK;
    }

    @JsonProperty("SGD")
    public Double getSGD() {
        return sGD;
    }

    @JsonProperty("SGD")
    public void setSGD(Double sGD) {
        this.sGD = sGD;
    }

    @JsonProperty("SIT")
    public Double getSIT() {
        return sIT;
    }

    @JsonProperty("SIT")
    public void setSIT(Double sIT) {
        this.sIT = sIT;
    }

    @JsonProperty("NOK")
    public Double getNOK() {
        return nOK;
    }

    @JsonProperty("NOK")
    public void setNOK(Double nOK) {
        this.nOK = nOK;
    }

    @JsonProperty("PLN")
    public Double getPLN() {
        return pLN;
    }

    @JsonProperty("PLN")
    public void setPLN(Double pLN) {
        this.pLN = pLN;
    }

    @JsonProperty("LTL")
    public Double getLTL() {
        return lTL;
    }

    @JsonProperty("LTL")
    public void setLTL(Double lTL) {
        this.lTL = lTL;
    }

    @JsonProperty("CYP")
    public Double getCYP() {
        return cYP;
    }

    @JsonProperty("CYP")
    public void setCYP(Double cYP) {
        this.cYP = cYP;
    }

    @JsonProperty("ZAR")
    public Double getZAR() {
        return zAR;
    }

    @JsonProperty("ZAR")
    public void setZAR(Double zAR) {
        this.zAR = zAR;
    }

    @JsonProperty("CAD")
    public Double getCAD() {
        return cAD;
    }

    @JsonProperty("CAD")
    public void setCAD(Double cAD) {
        this.cAD = cAD;
    }

    @JsonProperty("ISK")
    public Double getISK() {
        return iSK;
    }

    @JsonProperty("ISK")
    public void setISK(Double iSK) {
        this.iSK = iSK;
    }

    @JsonProperty("USD")
    public Double getUSD() {
        return uSD;
    }

    @JsonProperty("USD")
    public void setUSD(Double uSD) {
        this.uSD = uSD;
    }

    @JsonProperty("EEK")
    public Double getEEK() {
        return eEK;
    }

    @JsonProperty("EEK")
    public void setEEK(Double eEK) {
        this.eEK = eEK;
    }

    @JsonProperty("MTL")
    public Double getMTL() {
        return mTL;
    }

    @JsonProperty("MTL")
    public void setMTL(Double mTL) {
        this.mTL = mTL;
    }

    @JsonProperty("NZD")
    public Double getNZD() {
        return nZD;
    }

    @JsonProperty("NZD")
    public void setNZD(Double nZD) {
        this.nZD = nZD;
    }

    @JsonProperty("JPY")
    public Double getJPY() {
        return jPY;
    }

    @JsonProperty("JPY")
    public void setJPY(Double jPY) {
        this.jPY = jPY;
    }

    @JsonProperty("TRL")
    public Double getTRL() {
        return tRL;
    }

    @JsonProperty("TRL")
    public void setTRL(Double tRL) {
        this.tRL = tRL;
    }

    @JsonProperty("KRW")
    public Double getKRW() {
        return kRW;
    }

    @JsonProperty("KRW")
    public void setKRW(Double kRW) {
        this.kRW = kRW;
    }

    @JsonProperty("HUF")
    public Double getHUF() {
        return hUF;
    }

    @JsonProperty("HUF")
    public void setHUF(Double hUF) {
        this.hUF = hUF;
    }

    @JsonProperty("AUD")
    public Double getAUD() {
        return aUD;
    }

    @JsonProperty("AUD")
    public void setAUD(Double aUD) {
        this.aUD = aUD;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
