import http from 'k6/http'
import {check} from 'k6'

export const options = {
    vus: 24,
    duration: '30s',
}

const urlBase = `http://localhost:8080`


function createAlias(alias, url) {
    const data = {
        alias, url,
    }
    let resp = http.post(`${urlBase}/`, data);
    check(resp, {
        'should return 200': (r) => r.status === 200
    })
}

function get(alias) {
    let resp = http.get(`${urlBase}/${alias}`, {redirects: 0});
    check(resp, {
        'shoud return 308 Permanent Redirect': (r) => r.status === 308
    })
}

export function setup() {
    createAlias('gg','http://google.com')
}

export default function () {
    get('gg')
}


