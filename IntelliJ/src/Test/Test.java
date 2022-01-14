package Test;


import java.util.LinkedList;
import java.util.StringTokenizer;

public class Test {
    static String input = "프로세서\n" +
            "Intel\n" +
            "프로세서 제품군\n" +
            "Intel® Xeon® E3-1200 v6 제품군\n" +
            "Intel® Core™ i3\n" +
            "Intel® Pentium®\n" +
            "Intel® Xeon® E3-1200 v5 제품군\n" +
            "프로세서 코어 지원\n" +
            "4매 또는 2매\n" +
            "프로세서 캐시\n" +
            "8MB L3, 3MB L3\n" +
            "프로세서 속도\n" +
            "4.0GHz\n" +
            "메모리, 최대\n" +
            "64GB\n" +
            "메모리 슬롯\n" +
            "DIMM 슬롯 4개, 최대\n" +
            "메모리 유형\n" +
            "HPE 기본 메모리\n" +
            "메모리 보호 기능\n" +
            "고급 ECC\n" +
            "인프라 관리\n" +
            "iLO 관리(기본), Intelligent Provisioning(기본), iLO Essentials(옵션), iLO Scale-Out(옵션), iLO Advanced(옵션)\n" +
            "전원 공급장치 유형\n" +
            "(2) 엔트리 레벨\n" +
            "확장 슬롯\n" +
            "(2) 최대 - 자세한 설명은 QuickSpecs 참조\n" +
            "네트워크 컨트롤러\n" +
            "컨트롤러당 1Gb 332i 이더넷 어댑터 2포트\n" +
            "모든 모델에 적용 가능\n" +
            "스토리지 컨트롤러\n" +
            "Dynamic Smart Array B140i 또는\n" +
            "H240 호스트 버스 어댑터 또는\n" +
            "스마트 어레이 P440\n" +
            "모델에 따라 다름\n" +
            "시스템 팬 기능\n" +
            "핫 플러그 미지원 중복 미지원\n" +
            "폼 팩터\n" +
            "1U\n" +
            "제품 보증\n" +
            "1/1/1 서버 보증에는 1년 부품, 1년 공임 1년 현장 지원이 포함됩니다. 전 세계 제한 보증 및 기술 지원에 관한 추가 정보는 웹 사이트 www.hpe.com/services/support에서 확인하실 수 있습니다. 더불어 제품에 대한 Hewlett Packard Enterprise 지원 및 서비스 범위는 지역별로 구입 가능합니다. 서비스 업그레이드 사용 가능성과 비용에 대한 자세한 내용은 www.hpe.com/services/support를 참조하십시오.\n" +
            "최소 규격(너비 x 길이 x 높이)\n" +
            "4.32 x 43.46 x 38.22cm";
    public static void main(String args[]) {
        StringTokenizer str = new StringTokenizer(input,"\n");
        System.out.println("<div class = \"Specification_con\">");
        while (str.hasMoreTokens()){
            String temp = str.nextToken();
            if(temp.contains("(다운로드 필요)")){
                System.out.println("<div class = \"Specification_lis\">"+temp+"\n"+str.nextToken()+"</div>");
            }else {
                System.out.println("<div class = \"Specification_lis\">"+temp+"</div>");
            }
        }
        System.out.println("</div>");
    }
}
