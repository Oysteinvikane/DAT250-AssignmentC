import axios from 'axios'

const POLLUSER_REST_API = 'http://localhost:8080/users';

class PollUserService {

    getPollUsers() {
        return axios.get(POLLUSER_REST_API, { validateStatus: false });
    }
}

export default new PollUserService();