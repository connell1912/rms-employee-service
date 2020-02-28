import axios from 'axios';

export const axiosconfig = axios.create({
    baseURL: 'http://localhost:8080/'
})