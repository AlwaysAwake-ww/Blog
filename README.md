# Blog

팀 단위 게시물 등록, 공유가 가능한 간단한 게시판입니다.

페이지 디자인은 bootstrap 의 SB Admin 폼을 그대로 사용했습니다.

인증과 보안 처리는 Spring security를 사용했습니다.
회원 비회원 구분 및 로그인, 로그아웃 리다이렉트 URL과 로그인 실패시의 Handler를 설정하여 각각의 상황에서 적절한 View를 보여줄 수 있도록 구성했습니다.

회원 가입 시의 유효성 검사는 Bootstrap에서 기본적으로 지원하는 기능을 사용했습니다.
이전 프로젝트에서 프론트에서 Javascript 정규식을 통해 검증하여 유효성 여부를 판단하는 기능을 구현해 보았기 때문에 이번 프로젝트에서는 간소화 했습니다.

글쓰기 에디터는 기본적으로 이미지 첨부가 가능하고, 첨부한 이미지의 미리보기를 지원해야 하기 때문에 Multipart를 통해 첨부된 이미지를 temp 폴더에서 관리하고 이미지 미리보기를 보여주며 글 작성이 완료되는 시점에 temp 폴더의 이미지를 본래의 경로로 옮겨 저장했습니다.

또한, 이미지 첨부만 한 상태에서 글 저장을 완료하지 않을 경우 temp에 이미지 파일이 쌓이는 경우를 방지하기 위해 로그아웃 Handler를 통해 로그아웃 시 해당 User의 temp폴더의 이미지를 모두 제거하는 방법을 사용했습니다. 미리보기를 통해 게시물을 저장하기 전에 미리 게시물의 저장 모습을 확인할 수 있습니다.

팀을 생성하고 관리할 수 있습니다. 이름, 이메일을 통해 다른 User를 검색하여 생성하고자 하는 팀에 추가할 수 있으며 기존의 팀원을 삭제할 수 있습니다.

게시물은 작성자와 별개로 등록된 팀이 일대일 관계로 존재합니다. 게시물 등록/수정 시 작성자가 속한 팀 중 하나를 검색해서 등록할 수 있으며, 그렇게 등록된 게시물은 나중에 팀 관리 페이지에서 특정 팀이 등록된 게시물을 따로 모아서 확인할 수 있습니다.

게시물은 제목, 이메일, 작성자 등 내용을 토대로 검색할 수 있고, 본인이 작성한 게시물을 따로 모아서 볼 수도 있습니다. 이는 Spring Data Jpa의 메소드 중 Containing을 사용해 구현했습니다.

비동기 페이지 구성을 위해 JQuery와 Ajax를 사용했습니다. 특정 페이지의 특정 기능(팀 생성/관리 페이지의 User 검색 등)에서 활용 되었으며 페이지를 다시 불러오지 않고 HTML을 재구성하여 원활한 사용자 경험을 제공하는 것을 목적으로 했습니다.
