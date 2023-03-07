# 캐시 삭제
./gradlew clean

# 모든 폴더 및 파일 이름 변경
find . -depth -not -path "./.git/*" -name "*dawn*" -execdir bash -c 'mv "$1" "${1//dawn/wlv}"' _ {} \;

# 모든 파일 내용 변경 ( 소문자 )
find . -type f -not -path "./.git/*" -print0 | xargs -0 perl -i -pe 's/dawn/wlv/g'

# 모든 파일 내용 변경 ( 대문자 )
find . -type f -not -path "./.git/*" -print0 | xargs -0 perl -i -pe 's/Dawn/Wlv/g'

# invalidate cash restart 필요