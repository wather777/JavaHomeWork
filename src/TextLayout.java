import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.StringTokenizer;

/**
 * Created by s_chernykh on 23.05.2017.
 */
public class TextLayout extends Applet {
    final int LEFT = 0;
    final int RIGHT = 1;
    final int CENTER = 2;
    final int LEFTRIGHT = 3;

    int aligh;
    Dimension d;
    Font f;
    FontMetrics fm;
    int fontSize;
    int fh, bl;
    int space;
    String text;

    @Override
    public void init() {
        setBackground(Color.white);
        text = "\"DNSHostName\";\"operatingSystem\";\"(($_.DistinguishedName -split \"\",OU=√руппа компаний ’олидей\"\")[0] -split \"\",\"\" |select -Last 1) -replace \"\"OU=\"\" \"\n" +
                "\"1C-DEV.hclass.ru\";\"Windows Server 2003\";\"÷ентральный офис\"\n" +
                "\"1chc.hclass.ru\";\"Windows Server 2003\";\"÷ентральный офис\"\n" +
                "\"1cv7serv.hclass.ru\";\"Windows Server 2003\";\"÷ентральный офис\"\n" +
                "\"admin-fk.hclass.ru\";\"Windows ServerЃ 2008 Enterprise\";\"‘абрика  ухни\"\n" +
                "\"ARM2-BTS2010.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"biztalk.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"BIZTALK-TST-CL1.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"BRN-CORE.hclass.ru\";\"Windows Server 2008 R2 Enterprise\";\"‘абрика  ухни\"\n" +
                "\"BT-TESTNEW.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"cl-co-dfs.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"cl-dtc-cube.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"cl-omskrc1.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"DC=ru\"\n" +
                "\"cl-rcbsh.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"DC=ru\"\n" +
                "\"cl-sql-cube.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"cl-srv-cube.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"CONS-ESTAFF.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"CORE-BETON.hclass.ru\";\"Windows Server 2008 R2 Enterprise\";\"‘абрика  ухни\"\n" +
                "\"core-gbsh2.hclass.ru\";\"Windows Server 2012 R2 Datacenter\";\"‘абрика  ухни\"\n" +
                "\"CUBE-VIRT.hclass.ru\";\"Windows Server 2008 R2 Enterprise\";\"÷ентральный офис\"\n" +
                "\"CUBE-WEB.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"data2c.hclass.ru\";\"Windows Server 2012 R2 Standard\";\" емерово\"\n" +
                "\"datasql.hclass.ru\";\"Windows Server 2003\";\" емерово\"\n" +
                "\"DB-TECH.hclass.ru\";\"Windows Server 2008 R2 Enterprise\";\"‘абрика  ухни\"\n" +
                "\"DB-TECH2.hclass.ru\";\"Windows Server 2008 R2 Enterprise\";\"‘абрика  ухни\"\n" +
                "\"DB-TECH3.hclass.ru\";\"Windows Server 2008 R2 Enterprise\";\"‘абрика  ухни\"\n" +
                "\"DC-BRN.hclass.ru\";\"Windows Server 2008 R2 Enterprise\";\"‘абрика  ухни\"\n" +
                "\"DC-KEMEROVO.hclass.ru\";\"Windows Server 2008 R2 Enterprise\";\"‘абрика  ухни\"\n" +
                "\"DC-KRUP.hclass.ru\";\"Windows Server 2008 R2 Enterprise\";\"‘абрика  ухни\"\n" +
                "\"DEIMOS.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"DC=ru\"\n" +
                "\"dev_serv.hclass.ru\";\"Windows Server 2003\";\"÷ентральный офис\"\n" +
                "\"EARTH.hclass.ru\";\"Windows Server 2008 R2 Enterprise\";\"DC=ru\"\n" +
                "\"FK.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"‘абрика  ухни\"\n" +
                "\"FK-BETON.hclass.ru\";\"Windows Server 2008 R2 Enterprise\";\"‘абрика  ухни\"\n" +
                "\"FTP-BIZTALK.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"holidayvirt2012.hclass.ru\";\"Windows Server 2012 R2 Datacenter\";\"DC=ru\"\n" +
                "\"mgmtvnx.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"–÷ Ѕарс\"\n" +
                "\"MONITORING-NKLR.hclass.ru\";\"Windows Server 2008 R2 Standard\";\" емерово\"\n" +
                "\"MSCCM.hclass.ru\";\"Windows Server 2008 R2 Enterprise\";\"‘абрика  ухни\"\n" +
                "\"NF-SERVER.hclass.ru\";\"Windows Server 2008 R2 Enterprise\";\"‘абрика  ухни\"\n" +
                "\"obmennik.hclass.ru\";\"Windows Server 2003\";\" емерово\"\n" +
                "\"OMSK-FS.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"ќмск\"\n" +
                "\"omskrc1-db-test.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"DC=ru\"\n" +
                "\"omskrc1-term-test.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"DC=ru\"\n" +
                "\"omskrc2.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"DC=ru\"\n" +
                "\"omsk-srv-1c.hclass.ru\";\"Windows Server 2003\";\"ќмск\"\n" +
                "\"OMSK-SRV-TERM.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"ќмск\"\n" +
                "\"omsk-srv-virt.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"ќмск\"\n" +
                "\"P11-WDS.hclass.ru\";\"Windows Server 2008 R2 Enterprise\";\"‘абрика  ухни\"\n" +
                "\"PHOBOS.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"DC=ru\"\n" +
                "\"rc-bars.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"DC=ru\"\n" +
                "\"REVERSEPROXY.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"serv-1c-2012.hclass.ru\";\"Windows Server 2008 R2 Enterprise\";\"DC=ru\"\n" +
                "\"shopper.hclass.ru\";\"Windows Server 2003\";\" емерово\"\n" +
                "\"SIDOROV-SN1.hclass.ru\";\"Windows Server 2008 R2 Datacenter\";\"÷ентральный офис\"\n" +
                "\"SRV-1C8.hclass.ru\";\"Windows Server 2008 R2 Enterprise\";\"÷ентральный офис\"\n" +
                "\"SRV-1C-FK.hclass.ru\";\"Windows Server 2008 R2 Enterprise\";\"‘абрика  ухни\"\n" +
                "\"srv-1ckey-01.hclass.ru\";\"Windows Server 2003\";\"÷ентральный офис\"\n" +
                "\"srv-1c-sverki.hclass.ru\";\"Windows Server 2003\";\"÷ентральный офис\"\n" +
                "\"srv-1cuat-app.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"machines\"\n" +
                "\"srv-1cuat-term.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"machines\"\n" +
                "\"srv-1c-web.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"srv-1c-web2012.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"srv-ad-bars.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"DC=ru\"\n" +
                "\"SRV-AD-BRN.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"DC=ru\"\n" +
                "\"srv-ad-kem.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"DC=ru\"\n" +
                "\"SRV-AD-NSK-01.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"DC=ru\"\n" +
                "\"srv-ad-nsk-02.hclass.ru\";\"Windows Server 2012 R2 Datacenter\";\"DC=ru\"\n" +
                "\"SRV-AD-NVK.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"DC=ru\"\n" +
                "\"srv-ad-omsk-02.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"DC=ru\"\n" +
                "\"SRV-AD-TMSK.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"DC=ru\"\n" +
                "\"SRV-ASSORT.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"SRV-BARS-BLINK.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"–÷ Ѕарс\"\n" +
                "\"srv-bigrc1.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"DC=ru\"\n" +
                "\"srv-bigrc2.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"DC=ru\"\n" +
                "\"SRV-BTS03.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"SRV-BTS2010.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"srv-c220-omsk1.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"ќмск\"\n" +
                "\"srv-c220-omsk2.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"ќмск\"\n" +
                "\"SRV-CAPACITY.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"SRV-CASPER-BRN.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"Ѕарнаул\"\n" +
                "\"SRV-CC.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"SRV-CERT.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"srv-cld-sf-1capp.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"srv-cloud-1capp.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"srv-cloud-1csql.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"SRV-CO-1C8DO.hclass.ru\";\"Windows Server 2008 R2 Enterprise\";\"÷ентральный офис\"\n" +
                "\"srv-co-1ckey.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"srv-co-arm-ciw0.hclass.ru\";\"Windows Server 2003\";\"÷ентральный офис\"\n" +
                "\"srv-co-bi2.hclass.ru\";\"Windows Server 2012 R2 Datacenter\";\"÷ентральный офис\"\n" +
                "\"srv-co-dfs.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"srv-co-dfs-01.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"srv-co-dfs-02.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"srv-co-dhcp.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"srv-co-dp.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"srv-co-dzil.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"SRV-CO-EDI.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"srv-co-falcon.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"DC=ru\"\n" +
                "\"srv-co-insp.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"srv-co-kasper.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"srv-co-kasper-2.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"srv-co-kms.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"srv-co-mail-01.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"srv-co-mail-02.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"srv-co-obp.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"srv-co-rcbsh1.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"DC=ru\"\n" +
                "\"srv-co-rcbsh2.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"srv-co-rds-01.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"machines\"\n" +
                "\"srv-co-rds-02.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"machines\"\n" +
                "\"srv-co-revprox.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"srvcoscvmm.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"srv-co-secshare.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"srv-co-share.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"srv-co-sqlrds.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"machines\"\n" +
                "\"srv-co-testcl.hclass.ru\";\"Windows Server 2012 R2 Datacenter\";\"÷ентральный офис\"\n" +
                "\"srv-co-testlab.hclass.ru\";\"Windows Server 2012 R2 Datacenter\";\"÷ентральный офис\"\n" +
                "\"srv-co-testlab2.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"srv-co-web-osa.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"srv-co-web-osa2.hclass.ru\";\"Windows Server 2016 Datacenter\";\"÷ентральный офис\"\n" +
                "\"srv-co-wsus.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"SRV-DB-ALTAY.hclass.ru\";\"Windows Server 2008 R2 Enterprise\";\"‘абрика  ухни\"\n" +
                "\"SRV-DB-FK.hclass.ru\";\"Windows Server 2008 R2 Enterprise\";\"‘абрика  ухни\"\n" +
                "\"SRV-DB-GBSH.hclass.ru\";\"Windows Server 2008 R2 Enterprise\";\"‘абрика  ухни\"\n" +
                "\"SRV-DB-L10.hclass.ru\";\"Windows Server 2008 R2 Enterprise\";\"‘абрика  ухни\"\n" +
                "\"srv-dev.hclass.ru\";\"Windows Server 2012 R2 Datacenter\";\"÷ентральный офис\"\n" +
                "\"srv-dev-1c8.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"srv-dev-1c83.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"srv-dev-1CERP.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"srv-dev-1CZup.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"machines\"\n" +
                "\"srv-dev-archive.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"SRV-DEV-BI-WEB.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"SRV-DEV-BTS.hclass.ru\";\"Windows Server 2008 R2 Enterprise\";\"÷ентральный офис\"\n" +
                "\"SRV-DEV-ERP-BTS.hclass.ru\";\"Windows Server 2008 R2 Enterprise\";\"÷ентральный офис\"\n" +
                "\"SRV-DP-BRN.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"Ѕарнаул\"\n" +
                "\"SRV-DP-OMSK.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"ќмск\"\n" +
                "\"SRV-DP-TMSK.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"“омск\"\n" +
                "\"SRV-EDGE-LYNC.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"SRV-EXCELEDITOR.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"srv-fb.hclass.ru\";\"Windows Server 2003\";\"÷ентральный офис\"\n" +
                "\"srv-fk-admterm.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"‘абрика  ухни\"\n" +
                "\"srv-fk-rdp1.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"‘абрика  ухни\"\n" +
                "\"srv-fk-rdp2.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"‘абрика  ухни\"\n" +
                "\"srv-fk-rdp3.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"‘абрика  ухни\"\n" +
                "\"srv-fk-rdp4.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"‘абрика  ухни\"\n" +
                "\"srv-fk-rdp5.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"‘абрика  ухни\"\n" +
                "\"srv-fk-rdpsql.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"‘абрика  ухни\"\n" +
                "\"SRV-FS-NVK.hclass.ru\";\"Windows Server 2008 R2 Standard\";\" емерово\"\n" +
                "\"SRV-KASPER-TMSK.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"srv-kem1c77.hclass.ru\";\"Windows Server 2003\";\"÷ентральный офис\"\n" +
                "\"srv-kem-kasp.hclass.ru\";\"Windows Server 2012 R2 Standard\";\" емерово\"\n" +
                "\"SRV-LOADRMS.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"srv-logist-rc.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"SRV-LYNC.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"SRV-MERCH.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"SRV-MYQ.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"srv-nas-scan1v2.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"srv-nas-scan2v2.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"SRV-OLAP.hclass.ru\";\"Windows Server\";\"÷ентральный офис\"\n" +
                "\"srv-oms-1ctemp.hclass.ru\";\"Windows Server 2003\";\"ќмск\"\n" +
                "\"SRV-OMS-KASP.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"ќмск\"\n" +
                "\"srv-omsk-manh2app.hclass.ru\";\"Windows Server 2008 R2 Enterprise\";\"DC=ru\"\n" +
                "\"srv-omsk-manh2db.hclass.ru\";\"Windows Server 2008 R2 Enterprise\";\"DC=ru\"\n" +
                "\"srv-omsk-manh2term.hclass.ru\";\"Windows Server 2008 R2 Enterprise\";\"DC=ru\"\n" +
                "\"srv-omskrc1-app.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"DC=ru\"\n" +
                "\"srv-omskrc1-db.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"DC=ru\"\n" +
                "\"srv-omskrc1-term.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"DC=ru\"\n" +
                "\"srv-omskrc2-v01.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"ќмск\"\n" +
                "\"srv-omskrc2-v02.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"ќмск\"\n" +
                "\"srv-ortec-app.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"–÷ Ѕарс\"\n" +
                "\"srv-ortec-dbs.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"–÷ Ѕарс\"\n" +
                "\"srv-ortec-pmap.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"–÷ Ѕарс\"\n" +
                "\"srv-ortec-ps.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"–÷ Ѕарс\"\n" +
                "\"srv-ortec-term.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"machines\"\n" +
                "\"SRV-PRD-1C80.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"machines\"\n" +
                "\"srv-prd-merch.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"DC=ru\"\n" +
                "\"srv-qa-1C.hclass.ru\";\"Windows Server 2008 R2 Enterprise\";\"÷ентральный офис\"\n" +
                "\"SRV-QA-BTSARM1.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"SRV-QA-BTS-TST1.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"SRV-QA-ERPWEB.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"srv-qa-okk.hclass.ru\";\"Windows Server 2012 R2 Datacenter\";\"÷ентральный офис\"\n" +
                "\"srv-qa-rms2.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"SRV-QA-RMS-BTS4.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"srv-qa-rms-web.hclass.ru\";\"Windows Server 2008 R2 Enterprise\";\"÷ентральный офис\"\n" +
                "\"srv-rc121-egais.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"machines\"\n" +
                "\"srv-rc121-term.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"DC=ru\"\n" +
                "\"srv-rc44-egais.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"machines\"\n" +
                "\"srv-rc600-egais.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"–÷ Ѕарс\"\n" +
                "\"srv-rc600-etst.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"–÷ Ѕарс\"\n" +
                "\"srv-rc600-mapp.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"DC=ru\"\n" +
                "\"srv-rc600-mdb.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"DC=ru\"\n" +
                "\"srv-rc600-mtrm1.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"DC=ru\"\n" +
                "\"srv-rc600-mtrm2.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"DC=ru\"\n" +
                "\"srv-rc777-egais.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"DC=ru\"\n" +
                "\"srv-rc777-etst.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"DC=ru\"\n" +
                "\"srv-rcbsh-app.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"DC=ru\"\n" +
                "\"srv-rcbsh-db.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"DC=ru\"\n" +
                "\"srv-rcbsh-term3.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"DC=ru\"\n" +
                "\"SRV-SC2012.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"SRV-SODSTAT.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"SRV-SS-KEM.hclass.ru\";\"Windows Server 2008 R2 Standard\";\" емерово\"\n" +
                "\"SRV-SS-NVK.hclass.ru\";\"Windows Server 2008 R2 Standard\";\" емерово\"\n" +
                "\"SRV-STAFF.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"srv-term.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"SRV-TERM-KEM.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"srv-test-armmag.hclass.ru\";\"Windows Server 2003\";\"÷ентральный офис\"\n" +
                "\"srv-test-scale14.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"DC=ru\"\n" +
                "\"srv-tst-manhaio.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"DC=ru\"\n" +
                "\"srv-tst-omsk2-a.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"DC=ru\"\n" +
                "\"srv-tst-omsk2-d.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"DC=ru\"\n" +
                "\"srv-tst-omsk2-t.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"DC=ru\"\n" +
                "\"srv-tst-ortec-app.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"srv-tst-ortec-db.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"srv-tst-plgr.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"srv-tst-rc44app.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"DC=ru\"\n" +
                "\"srv-tst-rc44db.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"DC=ru\"\n" +
                "\"srv-tst-rc44trm.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"DC=ru\"\n" +
                "\"srv-tst-rc600-a.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"DC=ru\"\n" +
                "\"srv-tst-rc600-d.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"DC=ru\"\n" +
                "\"srv-tst-rc600-t.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"DC=ru\"\n" +
                "\"SRV-VIRT01.hclass.ru\";\"Windows Server 2012 R2 Datacenter\";\"÷ентральный офис\"\n" +
                "\"SRV-VIRT02.hclass.ru\";\"Windows Server 2012 R2 Datacenter\";\"÷ентральный офис\"\n" +
                "\"SRV-VIRT03.hclass.ru\";\"Windows Server 2012 R2 Datacenter\";\"÷ентральный офис\"\n" +
                "\"srv-virt04.hclass.ru\";\"Windows Server 2012 R2 Datacenter\";\"÷ентральный офис\"\n" +
                "\"srv-virt05.hclass.ru\";\"Windows Server 2012 R2 Datacenter\";\"÷ентральный офис\"\n" +
                "\"srv-virt06.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"srv-virt07.hclass.ru\";\"Windows Server 2012 R2 Datacenter\";\"÷ентральный офис\"\n" +
                "\"SRV-VIRT-KEM.hclass.ru\";\"Windows Server 2008 R2 Enterprise\";\" емерово\"\n" +
                "\"SRV-VIRT-NVK.hclass.ru\";\"Windows Server 2008 R2 Standard\";\" емерово\"\n" +
                "\"SRV-VIRT-OMSK.hclass.ru\";\"Windows Server 2008 R2 Enterprise\";\"ќмск\"\n" +
                "\"srv-virt-omsk2.hclass.ru\";\"Windows Server 2012 R2 Standard\";\"ќмск\"\n" +
                "\"SRV-WEB-APPS.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"SRV-WEB-EDI.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"SRV-ZAKAZ.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"SUN.hclass.ru\";\"Windows Server 2008 R2 Enterprise\";\"DC=ru\"\n" +
                "\"terminal-server.hclass.ru\";\"Windows Server 2003\";\" емерово\"\n" +
                "\"trader.hclass.ru\";\"Windows Server 2003\";\" емерово\"\n" +
                "\"TS220.hclass.ru\";\"Windows Server 2008 R2 Enterprise\";\"‘абрика  ухни\"\n" +
                "\"TS-FK8.hclass.ru\";\"Windows Server 2008 R2 Enterprise\";\"‘абрика  ухни\"\n" +
                "\"TST-BTS-RMS.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"÷ентральный офис\"\n" +
                "\"uik5.hclass.ru\";\"Windows Server 2003\";\" емерово\"\n" +
                "\"vnxfs01.hclass.ru\";\"EMC File Server\";\"DC=ru\"\n" +
                "\"WDS.hclass.ru\";\"Windows Server 2008 R2 Enterprise\";\"‘абрика  ухни\"\n" +
                "\"webserv.hclass.ru\";\"Windows Server 2003\";\" емерово\"\n" +
                "\"WKS-CO-1014.hclass.ru\";\"Windows Server 2008 R2 Standard\";\"÷ентральный офис\"\n";
        try {
            fontSize = Integer.parseInt("14");
        } catch (NumberFormatException e) {
            fontSize = 14;
        }
        aligh = LEFT;
        addMouseListener(new MyMouseAdapter(this));

    }

    @Override
    public void paint(Graphics g) {
        update(g);

    }


    @Override
    public void update(Graphics g) {

        d = getSize();
        g.setColor(getBackground());
        g.fillRect(0, 0, d.width, d.height);
        if(f==null) f = new Font("Serif", Font.PLAIN, fontSize);

        g.setFont(f);

        if (fm == null) {
            fm = g.getFontMetrics();
            bl = fm.getAscent();
            fh = bl + fm.getDescent();
            space = fm.stringWidth(" ");
        }

        g.setColor(Color.black);
        StringTokenizer st = new StringTokenizer(text);
        int x = 0;
        int nextx;
        int y = 0;
        String word, sp;
        int wordCount = 0;
        String line = "";
        while (st.hasMoreTokens()) {
            word = st.nextToken();
            if (word.equals("<P>")) {
                drawString(g, line, wordCount, fm.stringWidth(line), y + bl);
                line = "";
                wordCount=0;
                x = 0;
                y = y + (fh * 2);
            }else {
                int w = fm.stringWidth(word);
                if((nextx= (x+space+w))>d.width) {
                    drawString(g, line, wordCount, fm.stringWidth(line), y + bl);
                    line = "";
                    wordCount = 0;
                    x = 0;
                    y = y + fh;
                }
                if(x!=0){sp=" ";}else {sp="";}
                line = line + sp + word;
                x = x + space + w;
                wordCount++;
            }
        }
        drawString(g, line, wordCount, fm.stringWidth(line), y + bl);
    }


    public void drawString(Graphics g, String line, int wc, int lineW, int y) {
        switch (aligh) {
            case LEFT:
                g.drawString(line, 0, y);
                break;
            case RIGHT:
                g.drawString(line, d.width - lineW, y);
                break;
            case CENTER:
                g.drawString(line, (d.width - lineW) / 2, y);
                break;
            case LEFTRIGHT:
                if (lineW < (int) (d.width * .75)) {
                    g.drawString(line, 0, y);
                } else {
                    int toFill = (d.width - lineW) / wc;
                    int nudge = d.width - lineW - (toFill * wc);
                    int s = fm.stringWidth(" ");
                    StringTokenizer st = new StringTokenizer(line);
                    int x = 0;
                    while (st.hasMoreTokens()) {
                        String word = st.nextToken();
                        g.drawString(word, x, y);
                        if (nudge > 0) {
                            x = x + fm.stringWidth(word) + space + toFill + toFill + 1;
                            nudge--;
                        }else {
                            x = x + fm.stringWidth(word) + space + toFill;
                        }
                    }
                }
                break;
        }
    }
}

class MyMouseAdapter extends MouseAdapter {
    TextLayout tl;
    public MyMouseAdapter (TextLayout tl) {
        this.tl = tl;
    }

    public MyMouseAdapter() {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        tl.aligh = (tl.aligh + 1) % 4;
        tl.repaint();
    }
}