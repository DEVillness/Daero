package com.ssafy.daero.ui.signup

import com.ssafy.daero.R
import com.ssafy.daero.base.BaseFragment
import com.ssafy.daero.databinding.FragmentTermsBinding

class TermsFragment : BaseFragment<FragmentTermsBinding>(R.layout.fragment_terms){
    override fun init() {
        initView()
        setOnClickListeners()
    }

    fun initView() {
        binding.apply {
            textTermDetail1.text =
                "서비스 약관을 주의 깊게 읽어 주십시오. 이 계약에는 법적 구속력이 있습니다. DaeRo의 서비스를 이용해 주셔서 감사합니다. 여러분은 본 약관에 동의함으로써 서비스에 가입하여 서비스를 이용할 수 있습니다. 본 약관은 여러분이 서비스를 이용하는 데 필요한 권리, 의무 및 책임사항, 이용조건 및 기본적인 사항을 규정하고 있으므로 조금만 시간을 내서 주의 깊게 읽어주시기 바랍니다."

            textTermDetail2.text = "①본 약관의 내용은 서비스의 화면에 게시하거나 기타의 방법으로 공지하고, 본 약관에 동의한 여러분 모두에게 그 효력이 발생합니다.\n" +
                    "②회사는 필요한 경우 관련 법령을 위배하지 않는 범위 내에서 본 약관을 변경할 수 있습니다. 본 약관이 변경되는 경우 회사는 변경사항을 시행일자 15일 전부터 여러분에게 서비스 공지사항에서 공지 또는 통지하는 것을 원칙으로 하며, 피치 못하게 여러분에게 불리한 내용으로 변경할 경우에는 그 시행일자 30일 전부터 DaeRo 계정에 등록된 이메일 주소로 이메일 발송하는 방법으로 개별적으로 알려 드리겠습니다.\n" +
                    "③회사가 전 항에 따라 공지 또는 통지를 하면서 공지 또는 통지일로부터 개정약관 시행일 7일 후까지 거부의사를 표시하지 아니하면 승인한 것으로 본다는 뜻을 명확하게 고지하였음에도 여러분의 의사표시가 없는 경우에는 변경된 약관을 승인한 것으로 봅니다.\n" +
                        "④여러분은 변경된 약관에 대하여 거부의사를 표시함으로써 이용계약의 해지를 선택할 수 있습니다.\n" +
                        "⑤본 약관은 여러분이 본 약관에 동의한 날로부터 본 약관 제11조에 따른 이용계약의 해지 시까지 적용하는 것을 원칙으로 합니다. 단, 본 약관의 일부 조항은 이용계약의 해지 후에도 유효하게 적용될 수 있습니다"

            textTermDetail3.text = "본 약관에 규정되지 않은 사항에 대해서는 관련 법령 또는 서비스를 구성하는 이용약관, 운영정책 및 규칙 등(이하 총칭하여 ‘세부지침’)의 규정에 따릅니다. 또한 본 약관과 세부지침의 내용이 충돌할 경우 세부지침에 따릅니다."

            textTermDetail4.text = "①해당 서비스에 가입하기 위해서는 DaeRo계정이 필요합니다. DaeRo계정이 없으신 경우 DaeRo계정을 먼저 생성하시기 바랍니다.\n" +
                    "②통합서비스 이용계약은 여러분이 본 약관의 내용에 동의한 후 회사가 여러분의 DaeRo계정 정보 등을 확인한 후 승낙함으로써 체결됩니다."

            textTermDetail5.text = "①제4조에 따른 가입 신청자에게 회사는 원칙적으로 통합서비스 가입을 승낙합니다. 다만, 회사는 아래 각 호의 경우에는 그 사유가 해소될 때까지 승낙을 유보하거나 승낙하지 않을 수 있습니다. 특히, 여러분이 만 18세 미만인 경우에는 해당 서비스에 가입할 수 없습니다.\n" +
                    "\n" +
                    "1.여러분이 다른 사람의 명의나 이메일 주소 등 개인정보를 이용하여 통합서비스에 가입하려고 한 경우\n" +
                    "2.통합서비스 제공 설비 용량에 현실적인 여유가 없는 경우\n" +
                    "3.통합서비스 제공을 위한 기술적인 부분에 문제가 있다고 판단되는 경우\n" +
                    "4.기타 회사가 재정적, 기술적으로 필요하다고 인정하는 경우\n" +
                    "5.회사로부터 통합서비스 이용정지 조치 등을 받은 자가 그 조치기간에 통합서비스 이용계약을 임의로 해지하고 재가입을 신청하는 경우\n" +
                    "6.기타 관련 법령에 위배되거나 세부지침 등 회사가 정한 기준에 반하는 경우\n" +
                    "\n" +
                    "②만약, 여러분이 위 조건에 위반하여 해당 서비스에 가입한 것으로 판명된 때에는 회사는 즉시 여러분의 통합서비스 이용을 정지시키거나 DaeRo계정을 삭제하는 등 적절한 제한을 할 수 있습니다."

            textTermDetail6.text = "①서비스 이용계약이 성립되면, 여러분은 DaeRo 서비스를 여러분이 원하는 때에 자유롭게 이용할 수 있고, 별도의 이용계약을 체결할 필요가 없습니다.\n" +
                    "②여러분은 서비스 가입 후 언제든지 서비스를 구성하는 개별 서비스 내지 세부 하위 서비스 화면 또는 메뉴에서 제공하는 기능을 이용하여 해당 개별 서비스 또는 세부 하위 서비스의 이용을 종료할 수 있으며, 이 경우 관련 법령에서 정하는 바에 따라 일정기간 보관해야 하는 정보를 제외하고는 해당 서비스 이용기록, 여러분이 작성한 게시물 등 모든 데이터는 즉시 삭제 처리됩니다. 개별 서비스 또는 세부 하위 서비스 이용 종료 시점에 향후 일정기간 해당 서비스의 재이용에 제한이 있을 수 있다는 별도 안내가 있는 경우 해당 안내에 따라 해당 서비스의 재이용에 일정한 시간적 제한이 있을 수 있는 점 또한 유의하여 주시기 바랍니다.\n" +
                    "③전항에 따른 서비스의 이용 종료는 해당 서비스의 이용 종료를 의미합니다. 여러분이 서비스 전체의 이용을 종료하고 싶은 경우에는 본 약관 제11조에서 정한 바처럼 서비스 이용계약을 해지하여야 합니다.\n" +
                    "④회사는 여러분에게 SNS, 게시판 서비스, 온라인 콘텐츠 제공 서비스, 위치기반서비스 등 여러분이 인터넷과 모바일로 즐길 수 있는 다양한 서비스를 제공합니다. 여러분은 스마트폰의 어플리케이션 스토어 등에서 서비스를 다운받아 설치하여 서비스를 이용할 수 있습니다. 그런데 회사는 여러분이 원하는 다양한 서비스를 시시각각 제공하기 때문에 서비스의 자세한 내용은 별도로 알려드릴 수밖에 없습니다. 이러한 회사의 사정을 이해하여 주시길 바라며, 회사도 개별적인 서비스 이용방법을 어플리케이션 스토어와 각 서비스의 Q&A 센터, 해당 안내 및 고지사항에서 더 상세하게 안내하고 있으니 언제든지 확인하여 주시기 바랍니다.\n" +
                    "⑤회사는 여러분이 서비스를 마음껏 이용할 수 있도록 이에 필요한 소프트웨어의 개인적이고 전 세계적이며 양도불가능하고 비독점적인 무상의 라이선스를 여러분에게 제공합니다. 단, 회사가 여러분에게 회사의 상표 및 로고를 사용할 권리를 부여하는 것은 아니라는 점은 잊지 말아주시기 바랍니다.\n" +
                    "⑥회사는 더 나은 서비스를 위하여 서비스에 필요한 소프트웨어의 업데이트 버전을 제공할 수 있습니다. 소프트웨어의 업데이트에는 중요한 기능의 추가 또는 불필요한 기능의 제거 등이 포함되어 있습니다. 여러분들도 서비스를 즐겁게 이용할 수 있도록 꾸준히 업데이트를 하여 주시기 바랍니다.\n" +
                    "⑦회사는 스팸성 메일(피싱, 바이러스 유포, 개인정보 탈취 등 각종 불법 및 사행성 스팸을 의미합니다)로부터 이용자를 보호하기 위해 수발신 메일에 대한 스팸 대응 및 보안 조치를 합니다. 더불어 유관기관의 권고가 있거나 이용자 보호를 위하여 필요하다고 판단하는 경우 이에 따른 추가적인 스팸 운영정책 및 기능을 제공합니다.\n" +
                    "⑧서비스 이용 중 시스템 오류 등 문제점을 발견하신다면 언제든지 고객센터로 알려주시기 바랍니다.\n" +
                    "⑨여러분이 서비스를 이용하는 과정에서 Wi-Fi 무선인터넷을 사용하지 않고, 가입하신 이동통신사의 무선인터넷에 연결하여 이용하는 경우 이동통신사로부터 여러분에게 별도의 데이터 통신요금이 부과될 수 있는 점을 유의하여 주시기 바랍니다. 서비스 이용 과정에서 발생하는 데이터 통신요금은 여러분이 여러분의 비용과 책임 하에 이동통신사에 납부하셔야 합니다. 데이터 통신요금에 대한 자세한 안내는 여러분이 가입하신 이동통신사에 문의하시기 바랍니다."

            textTermDetail7.text = "①회사는 서비스를 365일, 24시간 쉬지 않고 제공하기 위하여 최선의 노력을 다합니다. 다만, 아래 각 호의 경우 서비스의 전부 또는 일부를 제한하거나 중지할 수 있습니다.\n" +
                    "\n" +
                    "1.서비스용 설비의 유지·보수 등을 위한 정기 또는 임시 점검의 경우\n" +
                    "2.정전, 제반 설비의 장애 또는 이용량의 폭주 등으로 정상적인 서비스 이용에 지장이 있는 경우\n" +
                    "3.관계사와의 계약 종료, 정부의 명령/규제, 서비스/회원 정책 변경 등 회사의 제반 사정으로 서비스의 전부 또는 일부를 유지할 수 없는 경우\n" +
                    "4.기타 천재지변, 국가비상사태 등 불가항력적 사유가 있는 경우\n" +
                    "\n" +
                    "②전항에 의한 서비스 중단의 경우에는 미리 제17조에서 정한 방법으로 여러분에게 통지 내지 공지하겠습니다. 이 때 원만한 서비스 및 정책 변경 등을 위하여 서비스 이용 시 재로그인 또는 추가적인 동의 절차 등이 필요할 수 있습니다. 다만, 회사로서도 예측할 수 없거나 통제할 수 없는 사유(회사의 과실이 없는 디스크 내지 서버 장애, 시스템 다운 등)로 인해 사전 통지 내지 공지가 불가능한 경우에는 그러하지 아니합니다. 이러한 경우에도 회사는 상황을 파악하는 즉시 최대한 빠른 시일 내에 서비스를 복구하도록 노력하고, 2시간 이상 복구가 지연되는 경우 서비스 공지사항, 카카오 고객센터 공지사항 등에 게시하여 알려 드리겠습니다."

            textTermDetail8.text = "①여러분의 게시물이 정보통신망 이용촉진 및 정보보호 등에 관한 법률(이하 ‘정보통신망법’)및 저작권법 등 관련 법령에 위반되는 내용을 포함하는 경우, 권리자는 회사에 관련 법령이 정한 절차에 따라 해당 게시물의 게시중단 및 삭제 등을 요청할 수 있으며, 회사는 관련 법령에 따라 조치를 취합니다.\n" +
                    "②회사는 권리자의 요청이 없는 경우라도 권리침해가 인정될 만한 사유가 있거나 기타 회사의 정책 및 관련 법령에 위반되는 경우에는 관련 법령에 따라 해당 게시물에 대해 임시조치 등을 취할 수 있습니다."

            textTermDetail9.text = "① 여러분은 사진, 글, 정보, 서비스 또는 회사에 대한 의견이나 제안 등 콘텐츠(이하 ‘게시물’)를 서비스 내에 게시할 수 있으며, 이러한 게시물에 대한 저작권을 포함한 지적재산권은 당연히 권리자가 계속하여 보유합니다.\n" +
                    "② 여러분이 서비스 내에 게시물을 게시하는 경우, 해당 게시물이 서비스에 포함되는 개별 서비스에 노출될 수 있고 이에 필요한 범위 내에서 사용, 저장, 수정, 복제, 공중송신, 전시, 배포 등의 방식으로 이용할 수 있도록 사용을 허락하는 전 세계적인 라이선스를 회사에게 제공하게 됩니다. 다시 한 번 알려드리지만, 본 라이선스에서 여러분이 회사에게 부여하는 권리는 서비스를 운영, 개선, 홍보하고 새로운 서비스를 개발하기 위한 범위 내에서 사용됩니다. 일부 개별 서비스에서는 여러분이 제공한 콘텐츠에 접근하거나 이를 삭제하는 방법을 제공할 수 있습니다(다만 일부 서비스의 특성 및 콘텐츠의 성질 등에 따라 게시물의 삭제가 불가능할 수도 있습니다). 또한 일부 서비스에서는 제공된 콘텐츠에 대한 회사의 사용 범위를 제한하는 설정이 있습니다.\n" +
                    "③여러분은 회사에 제공한 콘텐츠에 대해 회사에 라이선스를 부여하기 위해 필요한 권리를 보유해야 합니다. 이러한 권리를 보유하지 않아 발생하는 모든 문제에 대해서는 게시자가 책임을 부담하게 됩니다. 또한, 여러분은 음란하거나 폭력적이거나 타인에게 불쾌감을 주는 기타 공서양속 및 법령에 위반하는 콘텐츠를 공개 또는 게시할 수 없습니다.\n" +
                    "④회사는 여러분의 콘텐츠가 관련 법령에 위반되거나 음란 또는 사용자에게 유해한 게시물, 차별 갈등을 조장하는 게시물, 도배 · 광고 · 홍보 · 스팸성 게시물, 계정을 양도 또는 거래하는 내용의 게시물, 타인을 사칭하는 게시물 등이라고 판단되는 경우 이를 삭제하거나 게시를 거부할 수 있습니다. 다만 회사가 모든 콘텐츠를 검토할 의무가 있는 것은 아닙니다. 누군가 여러분의 권리를 침해하였다면, 신고 및 차단 기능 또는 고객센터를 통해 게시중단 요청에 대한 도움을 받으실 수 있습니다."

            textTermDetail10.text = "①여러분은 서비스를 자유롭게 이용할 수 있으나, 아래 각 호의 행위는 하여서는 안 됩니다.\n" +
                    "\n" +
                    "1. 개인이나 법인을 가장하거나, 개인이나 법인과의 제휴를 허위로 주장하거나, 허가 없이 타인의 DaeRo 서비스 계정에 접근하거나, 타인의 디지털 서명을 위조하거나, DaeRo 서비스를 통해 전송되는 정보의 출처, 신원, 내용을 잘못 표시하거나, 기타 이와 같은 정당하지 않은 행위를 하지 않아야 합니다.\n" +
                    "2. 회사의 서비스 정보를 이용하여 얻은 정보를 회사의 사전 승낙 없이 복제 또는 유통시키거나 상업적으로 이용하는 행위\n" +
                    "3. 부정확하거나, 불법적이거나, 타인의 권리를 침해하거나, 타인의 명예를 훼손시키거나 불이익을 주는 행위\n" +
                    "4. 선정적이거나, 외설적이거나, 타인의 사생활이나 초상 보호권을 침해하는 행위\n" +
                    "5. 게시판 등에 음란물을 게재하거나 음란사이트를 연결(링크)하는 행위\n" +
                    "6. 괴롭힘, 위협, 학대를 표현하거나, 선동적인 것을 비롯해 기타 불쾌감을 줄 수 있는 행위\n" +
                    "7. 회사 또는 제3자의 저작권 등 기타 권리를 침해하는 행위(국내외 제3자의 저작권 등을 침해하는 행위로서 회사가 IP 접속 차단 등 기술적인 조치를 통하여 타인에 대한 권리 침해 방지 조치를 취하였음에도 불구하고 이용자가 회사를 기망하는 수단과 방법 등을 통하여 서비스에 접속 하는 등 제3자의 저작권 등을 침해하는 행위를 포함합니다)\n" +
                    "7.서비스 내에 회사나 제3자 등에 대한 허위의 사실을 게시하는 행위\n" +
                    "8.공공질서 및 미풍양속에 위반되는 내용의 정보, 문장, 도형, 음성 등을 타인에게 유포하는 행위\n" +
                    "9.서비스와 관련된 설비의 오동작이나 정보 등의 파괴 및 혼란을 유발시키는 컴퓨터 바이러스 감염 자료를 등록 또는 유포하는 행위\n" +
                    "10.서비스의 운영을 방해하거나 안정적 운영을 방해할 수 있는 정보 및 수신자의 명시적인 수신거부의사에 반하여 또는 수신자의 명시적인 동의 없이 광고성 정보 또는 스팸메일(Spam Mail)을 전송하는 행위\n" +
                    "11.회사의 동의 없이 서비스 또는 이에 포함된 소프트웨어의 일부를 복사, 수정, 배포, 판매, 양도, 대여, 담보제공하거나 타인에게 그 이용을 허락하는 행위와 소프트웨어를 역설계하거나 소스 코드의 추출을 시도하는 등 서비스를 복제, 분해 또는 모방하거나 기타 변형하는 행위\n" +
                    "12.타인으로 가장하는 행위 및 타인과의 관계를 허위로 명시하는 행위\n" +
                    "13.다른 이용자의 개인정보를 수집, 저장, 공개하는 행위\n" +
                    "14.자기 또는 타인에게 재산상의 이익을 주거나 타인에게 손해를 가하는 등 피해를 입힐 목적으로 허위의 정보를 유통시키는 행위\n" +
                    "15.재물을 걸고 도박하거나 사행행위를 하는 행위\n" +
                    "16.윤락행위를 알선하거나 음행을 매개하는 내용의 정보를 유통시키는 행위\n" +
                    "17.수치심이나 혐오감 또는 공포심을 일으키는 말이나 글, 사진을 계속하여 상대방에게 도달하게 하여 상대방의 일상적 생활을 방해하는 행위\n" +
                    "18.관련 법령에 의하여 그 게시가 금지되는 정보(컴퓨터 프로그램 포함)의 게시 행위\n" +
                    "19.회사 또는 관계사의 직원이나 운영자를 가장하거나 사칭하여 또는 타인의 명의를 도용하여 글을 게시하거나 E-mail, 메시지 등을 발송하는 행위\n" +
                    "20.컴퓨터 소프트웨어, 하드웨어, 전기통신 장비의 정상적인 가동을 방해, 파괴할 가능성이 있는 소프트웨어 바이러스, 기타 다른 컴퓨터 코드, 파일, 프로그램을 포함하고 있는 자료를 게시하는 행위\n" +
                    "21.스토킹(stalking), 허위 또는 악의적 신고 남용 등 다른 이용자를 괴롭히는 행위\n" +
                    "22. DaeRo 서비스를 통해 전송되는 사용자 콘텐츠의 출처를 속이기 위해 ID를 조작하는 행위\n" +
                    "23. 관련 사용자 및 DaeRo로부터 허가를 받지 않고 다른 사용자의 계정을 사용하거나 그러한 시도를 하는 행위\n" +
                    "24.기타 현행 법령, 본 약관 및 운영정책 등 회사가 제공하는 서비스 관련 세부지침을 위반하는 행위\n" +
                    "\n" +
                    "②여러분은 서비스의 이용 권한, 기타 이용계약상 지위를 타인에게 양도·증여할 수 없으며, 담보로 제공할 수 없습니다.\n" +
                    "③회사는 서비스 내에서 이용자 간의 신고가 있는 경우, 신고된 이용자의 정보를 저장 및 보관할 수 있으며 이 정보는 회사만 보유합니다. 회사는 이용자간 분쟁 조정, 민원 처리를 위한 목적에 한하여, 제 3 자는 법령에 따라 권한이 부여된 경우에 한하여 이 정보를 열람할 수 있습니다. 회사는 부정이용 방지 및 관리의 목적에 따라 신고 접수시부터 3년간 해당 정보를 3년간 보관 후 파기합니다. \n" +
                    "④ 혹시라도 여러분이 관련 법령, 회사의 모든 약관 또는 정책을 준수하지 않는다면, 회사는 여러분의 위반행위 등을 조사할 수 있고, 해당 게시물 등을 삭제 또는 임시 삭제하거나 여러분의 계정・서비스 전체 이용을 잠시 또는 계속하여 중단하거나, 서비스 재가입 또는 재이용에 제한을 둘 수도 있습니다. 또한 여러분이 서비스와 관련된 설비의 오작동이나 시스템의 파괴 및 혼란을 유발하는 등 서비스 제공에 악영향을 미치거나 안정적 운영을 심각하게 방해한 경우, 회사는 이러한 위험 활동이 확인된 여러분의 계정들에 대하여 이용제한을 할 수 있습니다. 다만, 여러분은 이용제한과 관련하여 조치 결과가 불만족스러울 경우 고객센터를 통해 이의를 제기할 수 있습니다.\n" +
                    "⑤ 이용 제한은 위반 활동의 누적 정도에 따라 한시적 제한에서 영구적 제한으로 단계적 제한하는 것을 원칙으로 하지만, 음란한 내용의 게시와 유포 및 사행성 도박 홍보 등 관련 법령에서 금지하는 명백한 불법행위나 타인의 권리침해로서 긴급한 위험 또는 피해 차단이 요구되는 사안에 대해서는 위반 활동 횟수의 누적 정도와 관계 없이 즉시 영구적으로 이용이 제한될 수 있습니다."

            textTermDetail11.text = "①여러분이 DaeRo 계정 탈퇴를 하는 경우 서비스 이용계약도 자동으로 해지됩니다.\n" +
                    "②서비스 이용계약 해지를 원하는 경우 여러분은 언제든지 서비스 내 제공되는 메뉴를 이용하여 해지 신청을 할 수 있으며, 회사는 법령이 정하는 바에 따라 신속히 처리하겠습니다.\n" +
                    "③서비스 이용계약이 해지되면 관련 법령 및 DaeRo 개인정보 처리방침에 따라 여러분의 일정 정보를 보유하는 경우를 제외하고는 여러분의 정보나 여러분이 작성한 게시물 등 모든 데이터는 삭제됩니다.\n" +
                    "④ 서비스 이용계약이 해지된 경우라도 여러분은 다시 회사에 대하여 이용계약의 체결을 신청할 수 있습니다. 다만, 여러분이 관련 법령, 본 약관 및 세부지침을 준수하지 않아 서비스의 이용이 중단된 상태에서 이용계약을 해지한 후 다시 이용계약 체결을 신청하는 경우에는 통합서비스 가입에 일정기간 시간적 제한이 있을 수 있습니다. 또한 통합서비스를 구성하는 일부 개별 서비스의 경우 다시 통합서비스 이용계약을 체결한 후에도 해당 개별 서비스를 바로 이용하는 것에는 제6조 제3항에서 정한 바와 같이 일정한 시간적 제한 등이 따를 수 있습니다."

            textTermDetail12.text = "여러분의 개인정보의 안전한 처리는 회사에게 있어 가장 중요한 일 중 하나입니다. 여러분의 개인정보는 통합서비스의 원활한 제공을 위하여 여러분이 동의한 목적과 범위 내에서만 이용됩니다. 관련 법령에 의하거나 여러분이 별도로 동의하지 아니하는 한 회사가 여러분의 개인정보를 제3자에게 제공하는 일은 결코 없으므로, 안심하셔도 좋습니다."

            textTermDetail13.text = "①회사는 관련 법령상 허용되는 한도 내에서 서비스와 관련하여 본 약관에 명시되지 않은 어떠한 구체적인 사항에 대한 약정이나 보증을 하지 않습니다. 또한, 회사는 CP(Contents Provider)가 제공하거나 여러분이 작성하는 등의 방법으로 통합서비스에 게재된 정보, 자료, 사실의 신뢰도, 정확성 등에 대해서는 보증을 하지 않으며, 회사의 과실 없이 발생된 여러분의 손해에 대하여는 책임을 부담하지 아니합니다.\n" +
                    "②회사는 회사의 과실로 인하여 여러분이 손해를 입게 될 경우 본 약관 및 관련 법령에 따라 여러분의 손해를 배상하겠습니다. 다만 회사는 회사의 과실 없이 발생된 아래와 같은 손해에 대해서는 책임을 부담하지 않습니다. 또한 회사는 법률상 허용되는 한도 내에서 간접 손해, 특별 손해, 결과적 손해, 징계적 손해, 및 징벌적 손해에 대한 책임을 부담하지 않습니다.\n" +
                    "\n" +
                    "1.천재지변 또는 이에 준하는 불가항력의 상태에서 발생한 손해\n" +
                    "2.여러분의 귀책사유로 서비스 이용에 장애가 발생한 경우\n" +
                    "3.서비스에 접속 또는 이용과정에서 발생하는 개인적인 손해\n" +
                    "4.제3자가 불법적으로 회사의 서버에 접속하거나 서버를 이용함으로써 발생하는 손해\n" +
                    "5.제3자가 회사 서버에 대한 전송 또는 회사 서버로부터의 전송을 방해함으로써 발생하는 손해\n" +
                    "6.제3자가 악성 프로그램을 전송 또는 유포함으로써 발생하는 손해\n" +
                    "7.전송된 데이터의 생략, 누락, 파괴 등으로 발생한 손해, 명예훼손 등 제3자가 서비스를 이용하는 과정에서 발생된 손해\n" +
                    "8.기타 회사의 고의 또는 과실이 없는 사유로 인해 발생한 손해\n" +
                    "\n" +
                    "③회사는 여러분이 서비스를 통하여 얻은 자료로 인한 손해 등에 대하여도 책임을 지지 않습니다.\n" +
                    "④회사는 회사의 과실이 없는 한 여러분 상호간 또는 여러분과 제3자 상호간에 서비스를 매개로 발생한 분쟁에 대해서는 개입할 의무가 없으며 이로 인한 손해를 배상할 책임도 없습니다."

            textTermDetail14.text = "회사는 여러분과의 의견 교환을 소중하게 생각합니다. 여러분은 언제든지 DaeRo 문의 게시판을 통하여 의견을 개진할 수 있습니다. 서비스 이용자 전체에 대한 공지는 칠(7)일 이상 서비스 공지사항에 게시함으로써 효력이 발생합니다. 여러분에게 중대한 영향을 미치는 사항의 경우에는 DaeRo 계정에 등록된 이메일 주소로 이메일 발송하는 방법으로 개별적으로 알려 드리겠습니다."

            textTermDetail15.text = "본 약관 또는 통합서비스는 대한민국법령에 의하여 규정되고 이행됩니다. 통합서비스 이용과 관련하여 회사와 여러분 간에 분쟁이 발생하면 이의 해결을 위해 성실히 협의할 것입니다. 그럼에도 불구하고 해결되지 않으면 민사소송법의 관할법원에 소를 제기할 수 있습니다."
        }
    }

    private fun setOnClickListeners(){
        binding.imgTermBack.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }
}